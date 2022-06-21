package com.cashapona.generics.jun16;
/**
 * @author Anuradha
 * this program is an example of generic class, i.e. a class can referany type of data
 */
public class WithoutGenericClassExample {
	private int a;
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * create instance(classExample1) of GenericClassExample class and passed  Integer value
		 */
		WithoutGenericClassExample classExample=new WithoutGenericClassExample();
		classExample.setA(100);
		Integer intvalue=(Integer)classExample.getA();
		System.out.println("Get integer value : " +intvalue);
		/*
		 * create instance(classExample1) of GenericClassExample class and passed String value
		 * ClasssCastException araised
		 */
		/*GenericClassExample classExample1=new GenericClassExample();
		classExample1.setA("100");
		String stringvalue=(String)classExample.getA();
		System.out.println("Get String value : "+stringvalue);   */
		}
}
