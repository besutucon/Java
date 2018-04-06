package com.company.collection.set.HashSet;

import java.util.HashSet;

import com.company.collection.all.Student;

public class HashSetExample {

	private static final Student Student = null;

	public static void main (String[] args) {
		hashTable();
		hashSetwithPojo();
	}
	
	public static void hashTable() {
		HashSet<String> hset = new HashSet<>();
		hset.add("AA");
		hset.add("BB");
		hset.add("CC");
		hset.add("DD");
		hset.add(null);
		hset.add(null);
		
		System.out.println(hset);
	}
	// import from the Student in the collection.all 
	public static void hashSetwithPojo() {
		HashSet<Student> hs = new HashSet<>();
		hs.add(new Student("Knight", 1234, 20));
		hs.add(new Student("King", 1235, 18));
		hs.add(new Student("Queen", 1236, 15));
		
		System.out.println(hs);
	}
	
	
}
