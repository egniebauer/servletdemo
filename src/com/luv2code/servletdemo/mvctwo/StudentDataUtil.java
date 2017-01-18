package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents() {
		
		// create an empty list
		List<Student> students = new ArrayList<>();
		
		// add sample data
		students.add(new Student("Barry", "Allen", "faster@flash.com"));
		students.add(new Student("Misty", "Knight", "detective@nypd.com"));
		students.add(new Student("Matt", "Murdoch", "blind@lawyer.com"));
		
		//return the list
		return students;
	}
}
