package com.company.javaException;

public class ExamplesOfException {
	
	public static void  main(String[] args) {
		arithmeticException(45, 0);
		arrayIndexOutOfBounds(36);
		numberFormat("XYC");
		stringIndexOutOfBound(45);
		nullPointer(null);
		
	}
	
	public static void arithmeticException(int num1, int num2) {
		int numDiv;
		try {
			numDiv = num1/num2;
		}
		catch (ArithmeticException e1) {
			System.out.println("Undefine number. Error");
			
		}
	}
	
	public static void arrayIndexOutOfBounds(int num3) {
		try {
			int [] arr = new int[5];
			arr[num3] = 9;
			}

		catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("Array Index is out of the bound");
		}
	}
		
	
	public static void numberFormat(String str) {
		try {
			int number = Integer.parseInt(str);
			System.out.println(number);
		}
		catch(NumberFormatException e){
			System.out.println("This string cannot be convert into numbers");
		
		}
	
	}
	
	public static void stringIndexOutOfBound(int num4) {
		try {
			String str1 = "Java For Beginners";
			System.out.println("String lenght is "+ str1.length());
			str1.charAt(num4);
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("String index is out of the bound");
		}
			
	}
	
	
	public static void nullPointer(String str3) {
		try {
			String str2 = str3; // assign the string value 
			System.out.println(str2.length());// compare the length with null, find error here
	}
		catch(NullPointerException e){
			System.out.println("String gets null pointer");
		}

	}
}
// when u write an exception that means user define exception. 