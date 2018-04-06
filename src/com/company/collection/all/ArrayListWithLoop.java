package com.company.collection.all;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;


public class ArrayListWithLoop {

	static ArrayList<String> carList = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListLoop();
	}
	public static void ArrayListLoop() {
		carList.add("BMW");
		carList.add("Audi");
		
		for (int i =0; i< carList.size(); i++) {
			
			System.out.println("Simple For Loop:"+ carList.get(i));
		}
		
		for (String count : carList) {
			System.out.println("For Each Loop: " +count);
		}
		
		int num = 0;
		while(carList.size()>num) {
			System.out.println("While Loop: " + carList.get(num));
			num++;
		}
		
		Iterator in = carList.iterator();
		while (in.hasNext()) {
			System.out.println("Iterator: " + in.next());
		}
		
		Enumeration<String> e = Collections.enumeration(carList);
		while (e.hasMoreElements()) {
			System.out.println("With Enumeration: " + e.nextElement());
		}
		
	}

}
