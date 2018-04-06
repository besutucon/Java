package com.company.javaException;

public class TryCatchBlockExample {
	public static void main( String[] args) {
		//singleTryCatch();
		multipleTryCatch();
	}
	
	public static void singleTryCatch() {
		int num1; 
		int num2; 
		try {
			num1 = 0;
			num2 = 7/ num1; 
			System.out.println(num2);
			System.out.println("I am try block");
		}
		catch (ArithmeticException e) {
			System.out.println("Undefine Number. Please no divide numbers with zero");
				
		}
		System.out.println("This is ouside of the try catch block ");
	}
	
	public static void multipleTryCatch() {
		try {
			int [] arr = {3,6,5,7};
			for (int i = 0; i<6 ; i++) {
				System.out.println(arr[i]);
				//int num3 = 50/0;
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e1 ) {
			System.out.println("Array Index is out of the bound error");
			//must define e1, e2, e3 for every exception
		}
		catch(ArithmeticException e2) {
			System.out.println("Arithmatic Exception");
		}
		catch(Exception e3) {
			System.out.println("Just an Exception");
		}
		System.out.println("This is the end of multiple try-catch block");
	}
	
	

}
