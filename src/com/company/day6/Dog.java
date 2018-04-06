package com.company.day6;

public class Dog extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Make Some Noise Baby Bae");
		
	}
	public void bark() {
		System.out.println("Bark Bark Bark ");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Go get the ball");
		
	}

}
// only do impletation in the child class 