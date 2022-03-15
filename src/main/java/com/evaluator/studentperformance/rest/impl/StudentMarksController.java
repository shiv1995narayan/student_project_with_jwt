package com.evaluator.studentperformance.rest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evaluator.studentperformance.model.Student;
import com.evaluator.studentperformance.model.StudentMarks;
import com.studentperformance.service.impl.IStudentService;

@RestController
@CrossOrigin(origins = "*")
public class StudentMarksController {
	@Autowired
	IStudentService studentService;
	@PostMapping("/creatstudentMarks")
	public ResponseEntity<?> CreateStudentDetail(@RequestBody StudentMarks createStudentMarks)
	{
//		if(studentService.existsByRollno(createStudent.getRollno()))
//		{
//			return ResponseEntity.ok("Error: student record already taken!"); 
//			}
		studentService.saveStudentMarks( createStudentMarks);
		return ResponseEntity.ok("create student record successfull");
		
	
	}
	
	@GetMapping("/getstudentMarks")
	public List<StudentMarks> GetStudentMarks(StudentMarks getStudentMarks)
	{
		return studentService.getAllMarks(getStudentMarks);
	}

}
