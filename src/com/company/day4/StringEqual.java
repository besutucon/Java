package com.company.day4;

public class StringEqual {
public static void main(String[] args) {
	String str1 = new String ("Hello");
	String str2 = new String("Hi");
	String str3 = new String("HELLO");
	String str4 = new String("quick brown fox jumps over the lazy dog");
	
	System.out.println(str1.equals(str3));
	System.out.println(str1.equalsIgnoreCase(str3));
	System.out.println(str4.length()/2);
	System.out.println(str4.substring(0, 20));
	System.out.println(str4.indexOf("brown"));
	
	String msg = String.join("-", "This", "is","a","String");
	System.out.println(msg);
	
	String [] arr = {"Mike", "Majic","Peter"};
	String names = String.join("|", arr);
	System.out.println(names);
	
	String str6 = "      How      are     you      ";
	System.out.println(str6.trim());
	}
}
