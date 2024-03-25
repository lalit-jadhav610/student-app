package com.deeplal.studentapp.staticdata;

import java.util.ArrayList;
import java.util.List;

import com.deeplal.studentapp.model.Student;

public class StudentStaticData {

	private static List<Student> students = new ArrayList<>();
	
	static {
		students.add(new Student(1, "Lalit", "Jadhav", "2020", "Pune", 10));
		students.add(new Student(2, "Deepali", "Jadhav", "2021", "Kalyan", 12));
		students.add(new Student(3, "Chhaya", "Jadhav", "2022", "Nandura", 11));
		students.add(new Student(4, "Anil", "Jadhav", "2023", "Nashik", 15));
	}
	

	public static List<Student> getStudentStaticData() {
		return students;
	}
}
