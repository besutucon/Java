package com.company.day5;

public class Calculation {
	static float a = 5f;
	static float b = 7f;
	
	public static void main(String[] args) {
		
		addtion();
		substraction();
		multiple();
		division();
		
	}
	
	public static void addtion() {
		System.out.println(a+b);
	}
	
	public static void substraction() {
		System.out.println(a-b);
	}
	public static void multiple() {
		System.out.println(a*b);
	}
	public static void division() {
		System.out.println(a/b);
	}
}
// Come up with Calculator class and use Scanner for input 
//Class should be + - * / 
// not hardcoded