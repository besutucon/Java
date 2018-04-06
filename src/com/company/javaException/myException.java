package com.company.javaException;

public class myException extends Exception{

	String str1;
	String str2; 
	
	public myException(String str2) {
		str1 = str2;
	}
	
	public String toString() {
		return ("My Exception" + str1);
	}
}
// exception is throw the message for user that cannot do 