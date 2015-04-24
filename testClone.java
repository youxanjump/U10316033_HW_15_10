import java.util.ArrayList;

class myStack implements Cloneable {//class myStack implements interface Cloneable

	public ArrayList<Object> list = new ArrayList<>();
	//7~27,36~39 is useless method in this homework
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public int getSize(){
		return list.size();
	}
	
	public Object peek(){
		return list.get(getSize() - 1);
	}
	
	public Object pop(){
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	
	public void push(Object o){
		list.add(o);
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		myStack myStackClone = (myStack)super.clone();//shallow copy
		myStackClone.list = (ArrayList<Object>)(list.clone());//deep copy
		return myStackClone;
	}
	
	@Override
	public String toString(){
		return "Stack: " + list.toString();
	}
}

public class testClone implements Cloneable{

	public static void main(String args[]) throws CloneNotSupportedException{
		//create 2 object with different reference but same value
		myStack clone1 = new myStack();
		myStack clone2 = (myStack)(clone1.clone());
		//show that have different reference
		System.out.println("clone1 == clone2 ? " + (clone1 == clone2));
		System.out.println("clone1.list == clone2.list? " + (clone1.list == clone2.list));

	}
}
