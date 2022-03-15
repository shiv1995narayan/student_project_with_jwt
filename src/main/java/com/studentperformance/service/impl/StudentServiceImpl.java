package com.studentperformance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluator.studentperformance.dao.IStudentAchievementDao;
import com.evaluator.studentperformance.dao.IStudentDao;
import com.evaluator.studentperformance.dao.IStudentMarksDao;
import com.evaluator.studentperformance.model.Student;
import com.evaluator.studentperformance.model.StudentAchievement;
import com.evaluator.studentperformance.model.StudentMarks;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	IStudentDao studentdao;
	@Autowired
	IStudentMarksDao studentmarksdao;
	@Autowired
    IStudentAchievementDao studentAchievementdao;
	@Override
	public boolean existsByRollno(Integer rollno)
	 {
		return studentdao.existsByRollNo(rollno);
	 } 

	@Override
	public Student saveStudentDetail(Student createStudent) {
		return studentdao.save(createStudent);
		
	}

	@Override
	public List<Student> getAlldata(Student getStudentdata) {
		return studentdao.findAll();
	}

	@Override
	public void saveStudentMarks(StudentMarks createStudentMarks) {
		studentmarksdao.save(createStudentMarks);
		
	}

	@Override
	public List<StudentMarks> getAllMarks(StudentMarks getStudentMarks) {
		return studentmarksdao.findAll();
	}

	@Override
	public void saveStudentAchievement(StudentAchievement createStudentAchievement) {
		studentAchievementdao.save(createStudentAchievement);
		
	}

	@Override
	public List<StudentAchievement> getAllAchievement(StudentAchievement getStudentAchievement) {
		return studentAchievementdao.findAll();
	}
}
