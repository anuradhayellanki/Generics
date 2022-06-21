/**
 * created com.cashapona.generics.jun16 on 16 jun 2022
 */
package com.cashapona.generics.jun16;
/**
 * @author Anuradha
 * without using generics
 */
class ShowData{
	public void showIntData(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	public void showStringData(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	public void showFloatData(float a, float b) {
		System.out.println(a);
		System.out.println(b);
	}
}
public class ShowDataWithoutGenerics {
		/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShowData data=new ShowData();
		System.out.println("Calling by int values ");
		data.showIntData(12, 23);
		System.out.println("Calling by String values ");
		data.showStringData("anu", "23");
		System.out.println("Calling by float value ");
		data.showFloatData(12, 23);
	}
}
