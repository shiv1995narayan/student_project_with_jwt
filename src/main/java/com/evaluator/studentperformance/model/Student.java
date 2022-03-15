package com.evaluator.studentperformance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentDetail")
public class Student {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId_Pk;
	private String firstName;
	private String lastName;
	private String classStandard;
	private Integer age;
	
	private Integer rollNo;

	private Long  contactNo;
	
	
	
	public Student() {
	}


	public Student(String firstName, String lastName, String classStandard, Integer age,
			Integer rollNo, Long contactNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.classStandard = classStandard;
		this.age = age;
		this.rollNo = rollNo;
		this.contactNo = contactNo;
	}



	public Long getStudentId_Pk() {
		return studentId_Pk;
	}



	public void setStudentId_Pk(Long studentId_Pk) {
		this.studentId_Pk = studentId_Pk;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getClassStandard() {
		return classStandard;
	}



	public void setClassStandard(String classStandard) {
		this.classStandard = classStandard;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public Integer getRollNo() {
		return rollNo;
	}



	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}



	public Long getContactNo() {
		return contactNo;
	}



	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}



	@Override
	public String toString() {
		return "Student [studentId_Pk=" + studentId_Pk + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", classStandard=" + classStandard + ", age=" + age + ", rollNo=" + rollNo + ", contactNo="
				+ contactNo + "]";
	}
	
	
	

}
