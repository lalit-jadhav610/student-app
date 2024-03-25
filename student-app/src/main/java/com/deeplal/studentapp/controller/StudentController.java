package com.deeplal.studentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deeplal.studentapp.model.Student;
import com.deeplal.studentapp.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/isactive")
	public String testPing() {
		return "Service is Active...";
	}

	@GetMapping("/get")
	public List<Student> getStudents() {
		System.out.println("getStudentsgetStudentsgetStudents");
		return studentService.getStudents();
	}

	@GetMapping("/get/{id}")
	public Student getStudent(@PathVariable long id) {
		System.out.println("getStudent : " + id);
		return studentService.getStudent(id);
	}

	@PostMapping(path = "/add", consumes = "application/json")
	public Student addStudent(@RequestBody Student student) {
		System.out.println("addStudent : " + student);
		studentService.addStudent(student);
		return student;
	}

	@PutMapping(path = "/update", consumes = "application/json")
	public String updateStudent(@RequestBody Student student) {
		System.out.println("updateStudent : " + student);
		return studentService.updateStudent(student.getId(), student);
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public String updateStudent(@PathVariable long id) {
		System.out.println("updateStudent : " + id);
		studentService.deleteStudent(id);
		return "Deleted id : " + id;
	}
}
