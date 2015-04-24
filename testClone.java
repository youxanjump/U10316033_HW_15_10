import java.util.ArrayList;

class myStack implements Cloneable {

	public ArrayList<Object> list = new ArrayList<>();
	
	public myStack(){
		list = new ArrayList<Object>();
	}
	
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
		myStack myStackClone = (myStack)super.clone();
		myStackClone.list = (ArrayList<Object>)(list.clone());
		return myStackClone;
	}
	
	@Override
	public String toString(){
		return "Stack: " + list.toString();
	}
}

public class testClone implements Cloneable{

	public static void main(String args[]) throws CloneNotSupportedException{

		myStack clone1 = new myStack();
		myStack clone2 = (myStack)(clone1.clone());
		
		System.out.println("clone1 == clone2 ? " + (clone1 == clone2));
		System.out.println("clone1.list == clone2.list? " + (clone1.list == clone2.list));

	}
}
