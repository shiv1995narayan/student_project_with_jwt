package com.evaluator.studentperformance.rest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.evaluator.studentperformance.model.Student;
import com.studentperformance.service.impl.IStudentService;

@RestController
@CrossOrigin(origins = "*")
//@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	IStudentService studentService;

	@PostMapping("/creatstudent")
	public Student CreateStudentDetail(@RequestBody Student createStudent)
	{
//		if(studentService.existsByRollno(createStudent.getRollno()))
//		{
//			return ResponseEntity.ok("Error: student record already taken!"); 
//			}
		studentService.saveStudentDetail(createStudent);
		return studentService.saveStudentDetail(createStudent);
		
	
	}
	
	@GetMapping("/getstudentdata")
	public List<Student> GetStudentData(Student getStudentdata)
	{
		return studentService.getAlldata(getStudentdata);
	}
	
	
	//this direct call to repo 
//	
//	@Autowired
//	IStudentDao studentdao;
//
//
//	@PostMapping("/creatstudent")
//	public ResponseEntity<?> CreateStudentDetail(@RequestBody Student createStudent )
//	{
//		if(studentdao.existsByRollno(createStudent.getRollno()))
//		{
//			return ResponseEntity.ok("Error: student is already taken!"); 
//			}
//		
//		studentdao.save(createStudent);
//		return ResponseEntity.ok("create student record successfull");
//		
//	}
	
	
}
