package com.company.day4;

public class JavaConstructor {
	String fname;
	String lname;
	int Age;
	
	public JavaConstructor(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		Age = age;
	}

	@Override
	public String toString() {
		return "JavaConstructor [fname=" + fname + ", lname=" + lname + ", Age=" + Age + "]";
	}

	public JavaConstructor() {
		super();
	}
	
	



}
// class always contain variable(local varible, global varible), methods, 

