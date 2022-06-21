/**
 * com.cashapona.generics created on 16 jun 2022
 */
package com.cashapona.generics.jun16;
/**
 * @author Anuradha
 *
 */
public class GenericsRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCustomList<Integer> list1=new MyCustomList<Integer> ();
		list1.addElement(10);
		list1.addElement(30);
		list1.addElement(100);
		System.out.println("List : "+list1);
		list1.removeElement(30);
		System.out.println("After remove(30) List : "+list1);
		System.out.println("get(1) : "+list1.get(1));
		
		MyCustomList<String> list2=new MyCustomList<String> ();
		list2.addElement("anu");
		list2.addElement("ravi");
		list2.addElement("radha");
		System.out.println("List : "+list2);
		list2.removeElement("radha");
		System.out.println("After remove(radha) List : "+list2);
		System.out.println("get(1) : "+list2.get(1));
	}

}
