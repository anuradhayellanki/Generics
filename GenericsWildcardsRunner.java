package com.cashapona.generics.jun16;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anuradha
 */
public class GenericsWildcardsRunner {
	static Number sumOfNumberList(List<? extends Number>numbers) {
		double sum= 0.0;
		for(Number number: numbers) {
			sum+=number.doubleValue();
		}
		return sum;
	}
	static void addValues(List<? super Number>numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1l);
		numbers.add(1.0f);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LowersBound wildcaards");
		ArrayList<Number> list=new ArrayList<Number>();
		addValues(list);
		System.out.println(list);
		System.out.println("UpperBound wildcaards");
		System.out.println(sumOfNumberList(List.of(1,45,23)));
		System.out.println(sumOfNumberList(List.of(1.1,45.1,23.1)));
		System.out.println(sumOfNumberList(List.of(1l,4l,2l)));
		
	}

}
