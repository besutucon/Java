package com.company.day6;

public class Zoo {
	public static void main (String[] args) {
		Animal a1 = new Cat();
		a1.makeNoise();
		a1.move();
		
		Animal a2 = new Dog();
		a2.makeNoise();
		a2.move();
	}
}

// abstract class force the child class to have the function in the abstract class 