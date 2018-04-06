package com.company.day4;

public class PersonExample {
	public static void main(String[] args) {
		PersonConstructor ss = new PersonConstructor();
			ss.fName = "Sam";
			ss.lName = "Smith";
			ss.Address = "Los Angeles";
			ss.phoneNumber = 123456;
			
	
		PersonConstructor bk = new PersonConstructor();
			bk.fName = "Baskin";
			bk.lName = "Robin";
			bk.Address = "NYC";
			bk.phoneNumber = 456789;
		
		PersonConstructor jl = new PersonConstructor();
			jl.fName = "Jillian";
			jl.lName = "Long";
			jl.Address = "Chicago";
			jl.phoneNumber = 345678;
			
		
		System.out.println(ss.fName + " "+ ss.lName+" "+ss.Address+ " "+ ss.phoneNumber);
		System.out.println(bk.fName + " "+ bk.lName+" "+bk.Address+" " + bk.phoneNumber);
		System.out.println(jl.fName + " "+ jl.lName+" "+jl.Address+ jl.phoneNumber);
	}
	

}
