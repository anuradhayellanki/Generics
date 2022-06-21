package com.cashapona.generics.jun16;
/**
* @author Anuradha
* using generics
*/
public class ShowDataWithGenerics {
	public <E> void showData(E a,E b) {
		System.out.println(a);
		System.out.println(b);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShowDataWithGenerics data=new ShowDataWithGenerics();
		System.out.println("Calling by int values ");
		data.showData(12, 23);
		System.out.println("Calling by String values ");
		data.showData("anu", "23");
		System.out.println("Calling by float values ");
		data.showData(12, 23);
	}

}
