package com.deeplal.studentapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deeplal.studentapp.model.Student;
import com.deeplal.studentapp.repository.StudentRepository;
import com.deeplal.studentapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudent(long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public String updateStudent(long id, Student student) {
		studentRepository.save(student);
		return "ID " + id + " is updated";
	}

	@Override
	public void deleteStudent(long id) {
		studentRepository.deleteById(id);
	}

}
