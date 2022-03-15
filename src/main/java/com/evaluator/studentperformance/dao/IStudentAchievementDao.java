package com.evaluator.studentperformance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evaluator.studentperformance.model.StudentAchievement;
import com.evaluator.studentperformance.model.StudentMarks;

public interface IStudentAchievementDao extends JpaRepository<StudentAchievement, Long>{

		Boolean existsByRollNo(Integer rollNo);
}

