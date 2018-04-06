package com.company.collection.all;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleArrayList {

	public static void main(String[] args) {
		ArrayListExample();

	}
	
	public static void ArrayListExample() {
		ArrayList<String> fruitList = new ArrayList<>();
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Orange");
		fruitList.add("Pear");
		System.out.println(fruitList);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a fruit: ");
		fruitList.add(scan.nextLine());
		System.out.println(fruitList);
		
		fruitList.remove(2);
		System.out.println(fruitList);
		System.err.println(fruitList.size());
		
		fruitList.remove("Pear");
		System.out.println(fruitList);
		
		System.out.println("Enter a fruit: ");
		fruitList.add(2, scan.nextLine()); // overloading in the same class
		System.out.println(fruitList);
		
		fruitList.set(0, "Mango");
		System.out.println(fruitList);
		
		scan.close();
	}

}
