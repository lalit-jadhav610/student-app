package com.deeplal.studentapp.service;

import java.util.List;

import com.deeplal.studentapp.model.Student;

public interface StudentService {

	List<Student> getStudents();

	Student getStudent(long id);
	
	void addStudent(Student student);
	
	String updateStudent(long id, Student student);
	
	void deleteStudent(long id);
}
