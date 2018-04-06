package com.company.day6;

public class Accord extends Car {

	@Override
	public void hasWheel() {
		// TODO Auto-generated method stub
		System.out.println("18 inches wheel");
		
	}

	@Override
	public void hasEngine() {
		// TODO Auto-generated method stub
		System.out.println("v8 Engine");
	}

	@Override
	public void hasCarBody() {
		// TODO Auto-generated method stub
		System.out.println("Sexy Red Body Color");
	}
	
	public void runFast() {
		System.out.println("Run Faster Baby");
	}

}
