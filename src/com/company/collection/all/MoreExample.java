package com.company.collection.all;

import java.util.ArrayList;

public class MoreExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleTestforPOJO();

	}
	
	public static void sampleTestforPOJO() {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add( new Student("Mike", 1234, 20));
		studentList.add( new Student("Anna", 1235, 28));
		studentList.add( new Student("Mary", 1236, 28));
		System.out.println(studentList);
		}
	
}


