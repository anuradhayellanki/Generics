package com.cashapona.generics.jun16;
/**
 * @author Anuradha
 * this program is an example of generic class, i.e. a class can refer any type of data
 */
public class WithGenericClassExample<T1,T2> {
	private T1 obj1;
	private T2 obj2;
	public void setData(T1 object1, T2 object2) {
		obj1=object1;
		obj2=object2;
	}
	public void getData() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * create instance(classExample) of GenericClassExample class and passed  Integer value
		 */
		WithGenericClassExample<String, String> classExample=new WithGenericClassExample<String, String>();
		classExample.setData("Java","Programming");
		System.out.print("Get String values");
		classExample.getData();
		/*
		 * create instance(classExample1) of GenericClassExample class and passed String value
		 * ClasssCastException araised
		 */
		WithGenericClassExample<Integer, Integer> classExample1=new WithGenericClassExample<Integer, Integer>();
		classExample1.setData(100,10);
		System.out.println("Get Integer values");
		classExample1.getData();
		
	}

}
