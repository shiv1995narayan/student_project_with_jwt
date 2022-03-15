package com.evaluator.studentperformance.rest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evaluator.studentperformance.model.StudentAchievement;
import com.evaluator.studentperformance.model.StudentMarks;
import com.studentperformance.service.impl.IStudentService;

@RestController
@CrossOrigin(origins = "*")
public class StudentAchievementController {
	@Autowired
	IStudentService studentService;
	@PostMapping("/creatstudentAchievement")
	public ResponseEntity<?> CreateStudentDetail(@RequestBody StudentAchievement createStudentAchievement)
	{
		studentService.saveStudentAchievement( createStudentAchievement);
		return ResponseEntity.ok("create student record successfull");
		
	
	}
	
	@GetMapping("/getStudentAchievement")
	public List<StudentAchievement> GetStudentAchievement(StudentAchievement getStudentAchievement)
	{
		return studentService.getAllAchievement(getStudentAchievement);
	}

}


