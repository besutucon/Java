package com.company.javaException;

public class ThrowException {
	//Student Age < 12
	//Student Weight < 40 
	public static void main(String[] args) {
		checkEligibility(10, 35);
	}
	
	static void checkEligibility( int studentAge, int studentWeight) {
		if(studentAge < 12 && studentWeight < 40) {
			throw new ArithmeticException("Student is not eligible");
		}
		else {
			System.out.println("Student is eligible");
		}
	}
}
