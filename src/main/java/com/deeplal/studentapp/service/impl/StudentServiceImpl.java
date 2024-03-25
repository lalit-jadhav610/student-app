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

//	@Override
//	public List<Student> getStudents() {
//		return StudentStaticData.getStudentStaticData();
//	}
//
//	@Override
//	public Student getStudent(long id) {
//		List<Student> students = StudentStaticData.getStudentStaticData().stream()
//				.filter(student -> (student.getId() == id)).collect(Collectors.toList());
//		return CollectionUtils.isEmpty(students) ? null : students.get(0);
//	}
//
//	@Override
//	public void addStudent(Student student) {
//		StudentStaticData.getStudentStaticData().add(student);
//	}
//
//	@Override
//	public String updateStudent(long id, Student student) {
//		Student existsStudent = this.getStudent(id);
//		if (Objects.isNull(existsStudent)) {
//			return "No such id present : " + id;
//		} else {
//			StudentStaticData.getStudentStaticData().remove(existsStudent);
//			StudentStaticData.getStudentStaticData().add(student);
//			return "Updated id : " + id;
//		}
//	}
//
//	@Override
//	public void deleteStudent(long id) {
//		Student existsStudent = this.getStudent(id);
//		StudentStaticData.getStudentStaticData().remove(existsStudent);
//	}

}
