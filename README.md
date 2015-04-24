# U10316033_HW_15_10
testDeepCopy

import java.util.ArrayList;
package java.lang;

class myStack implements Cloneable {

	private ArrayList<Object> list = new ArrayList<>();
	
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public int getSize(){
		return list.size();
	}
	
	public Object peek(){
		return list.get(getSize() - 1);
	}
	
	public String pop(){
		String o = list.get(getSize() - 1);
		remove(list.getSize() - 1);
	}
	
	public void push(Object o){
		list.add(o);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		myStack myStackClone = (myStack)super.clone();
		myStackClone.list = ArrayList<Object>(list.clone());
		return myStackClone;
	}
	
	@Override
	public String toString(){
		return "Stack: " + list.toString();
	}
}

public class testClone{
	
}
