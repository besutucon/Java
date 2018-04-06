package com.company.day5;

public class MethodHowTo {// this is the class
	
	public static void main(String[] args) {// this is the main method 
		myMethod();
		myInt();
		System.out.println(square());
	}
	
	private static void myMethod() { // this is the private method, not work outside the class
		System.out.println("Printing my method");
	}
	
	public static void myInt() {// this is the public method, work outside the class
		int a = 5;
		int b = 10;
		
		System.out.println(a*b);
	}
	
	static int square() {
		return 10*10;
	
	}
}
