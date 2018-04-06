package com.company.day3;

public class BreakExample {
	public static void main(String[] args) {
		int var; //default value of int is 0 
		for (var =100; var >=10; var --) {
			System.out.println("Var " + var);
			if (var == 70) {
				break;
			}
		}
		System.out.println("Out of the loop");
	}
}

