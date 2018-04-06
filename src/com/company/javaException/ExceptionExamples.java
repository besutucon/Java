package com.company.javaException;

import javax.imageio.IIOException;

public class ExceptionExamples {

	public static void main(String[] args) throws IIOException {
		try {
			System.out.println("Starting of try");
			throw new myException("This is an error");
		}
		catch(myException exp) {
			System.out.println("catch block");
			System.out.println(exp);
		}
	}
}
// inside the class we use throws, inside the try block we use throw
