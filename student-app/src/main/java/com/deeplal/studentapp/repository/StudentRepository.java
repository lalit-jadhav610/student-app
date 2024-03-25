package com.deeplal.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deeplal.studentapp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
