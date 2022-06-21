package com.cashapona.generics.jun16;
import java.util.ArrayList;
/**
 * @author Anuradha
 */
public class MyCustomList<T> {
	ArrayList<T> list=new ArrayList<T>();
	/**
	 * @param Element
	 */
	public void removeElement(T Element) {
		// TODO Auto-generated method stub
		list.remove(Element);
	}
	/**
	 * @param i
	 */
	public void addElement(T Element) {
		// TODO Auto-generated method stub
		list.add(Element);
	}
	/**
	 * @param i
	 * @return
	 */
	public T get(int index) {
		// TODO Auto-generated method stub
		return list.get(index);
	}
	public String toString() {
		return list.toString();
	}
}
