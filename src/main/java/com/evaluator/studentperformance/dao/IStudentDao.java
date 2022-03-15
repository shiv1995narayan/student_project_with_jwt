package com.evaluator.studentperformance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluator.studentperformance.model.Student;

@Repository
public interface IStudentDao extends JpaRepository<Student, Long> {
	
	Boolean existsByRollNo(Integer rollno);
	

}
