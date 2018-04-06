package com.company.day5;
// Encapsulation Example 
public class EncapTest {
	public static void main(String[] args) {
		Encapsulation ed = new Encapsulation();
		ed.setEmpName("Mary");// set the database
		ed.setEmpAge(28);
		ed.setSsn(5678);
		
		System.out.println(ed.getEmpName());//get the database, dont change the database
		System.out.println(ed.getEmpAge());
		System.out.println(ed.getSsn());
	}

}
// Encapsulation means hiding the data and get it whenever it needs, 
// use private class, and use set and get to use the data when it needs 
// more protect than abstract class