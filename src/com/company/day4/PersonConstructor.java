package com.company.day4;

public class PersonConstructor {

	String fName;
	String lName;
	String Address;
	int phoneNumber; 
	
	public PersonConstructor(String fName, String lName, String Address, int phoneNumber){
		super ();
		this.fName = fName;
		this.lName = lName;
		this.Address = Address;
		phoneNumber = phoneNumber;
		
	}
	public PersonConstructor() {
		super();
	}
}
