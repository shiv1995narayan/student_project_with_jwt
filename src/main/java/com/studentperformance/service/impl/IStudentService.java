package com.studentperformance.service.impl;

import java.util.List;

import com.evaluator.studentperformance.model.Student;
import com.evaluator.studentperformance.model.StudentAchievement;
import com.evaluator.studentperformance.model.StudentMarks;

public interface IStudentService {
	
	public boolean existsByRollno(Integer rollno);
	
	public Student saveStudentDetail(Student createStudent);

	public List<Student> getAlldata(Student getStudentdata);
	
	public void saveStudentMarks(StudentMarks createStudentMarks);

	public List<StudentMarks> getAllMarks(StudentMarks getStudentMarks);
	
	public void saveStudentAchievement(StudentAchievement createStudentAchievement);

	public List<StudentAchievement> getAllAchievement(StudentAchievement getStudentAchievement);
}

