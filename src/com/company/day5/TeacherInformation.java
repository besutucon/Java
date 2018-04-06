package com.company.day5;

public class TeacherInformation extends TeacherDepartment {
	public static void main(String[] args) {
		TeacherInformation td = new TeacherInformation();
		td.setTeacherName("Anna");
		td.setSubject("Speech");
		td.setTeacherSSN(123456789);
		
		System.out.println(td.getTeacherName());
		System.out.println(td.getSubject());
		System.out.println(td.getTeacherSSN());
	}
}
