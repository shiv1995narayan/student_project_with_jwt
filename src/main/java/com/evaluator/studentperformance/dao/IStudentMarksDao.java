package com.evaluator.studentperformance.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.evaluator.studentperformance.model.StudentMarks;

public interface IStudentMarksDao extends JpaRepository<StudentMarks, Long>{
	Boolean existsByRollNo(Integer rollNo);
}
