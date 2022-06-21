package com.cashapona.generics.jun16;
import java.util.Hashtable;

/**
 * @author Anuradha
  */
public class HashtableRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable=new Hashtable<Integer, String>();
		hashtable.put(1, "anu");
		hashtable.put(90, "asha");
		hashtable.put(20 ,"rasi");
		System.out.println("Hashtable : "+hashtable);
		//hashtable.rehash();//this method rehash() from the type hashtable is not available
		/*
		 * getOrDefault(key, default), if the specified key is in map then specified value is displayed
		 * if key specified key is not there , then the key and value will be store in map
		 */
		System.out.println(" After getOrDefault Hashtable : "+hashtable.getOrDefault(20, "ravi"));
		/*
		 * putIfAbsent()
		 */
		System.out.println("After putIfAbsent :"+hashtable.putIfAbsent(1, "radha"));
		System.out.println("Hashtable : "+hashtable);
	}
}
