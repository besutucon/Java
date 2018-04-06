package com.company.day5;

public class ArithematicMain {
	
	public static void main(String[] args) {
	
	System.out.println("Sum a and b is "+ getIntegerSum(10,20));
	
	System.out.println("Multiply a and b is "+ multiplyInteger(20,40));
		
	}
	
	public static int getIntegerSum(int a,int b) {
		return a+b;
	}
	public static int multiplyInteger(int a,int b) {
		return a*b;
	}
}
