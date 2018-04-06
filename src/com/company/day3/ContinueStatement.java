package com.company.day3;

public class ContinueStatement {
	public static void main(String[] args) {
		int num = 0;
		while (num <=100) {
			System.out.println("Value of varible is " + num);
			if (num ==5) {
				break;
			}
			num++;
		}
		System.out.println("Out of the loop");
	}
}
