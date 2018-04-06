package com.company.javaException;

public class TwoTryCatchBlockExample {
	
	public static void main(String[] args) {
		finallyTry();
	}
	
	public static void finallyTry() {
		try {
			int num = 132/0;
			System.out.println(num);	
		}
		catch(ArithmeticException e){
			System.out.println("Number can not divide for zero");
		}
		finally {
			System.out.println("This is the finally block");
		}
		System.out.println("This is the end  of try catch finally block");
	}

}
// use for the wrong password