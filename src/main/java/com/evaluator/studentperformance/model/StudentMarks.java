package com.evaluator.studentperformance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentMarks123")
public class StudentMarks {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
@Column(unique=true)
private Integer rollNo;
private Integer english1;
private Integer hindi1;
private Integer maths1;
private Integer physics1;
private Integer chemistry1;
private Integer english2;
private Integer hindi2;
private Integer maths2;
private Integer physics2;
private Integer chemistry2;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Integer getRollNo() {
	return rollNo;
}
public void setRollNo(Integer rollNo) {
	this.rollNo = rollNo;
}
public Integer getEnglish1() {
	return english1;
}
public void setEnglish1(Integer english1) {
	this.english1 = english1;
}
public Integer getHindi1() {
	return hindi1;
}
public void setHindi1(Integer hindi1) {
	this.hindi1 = hindi1;
}
public Integer getMaths1() {
	return maths1;
}
public void setMaths1(Integer maths1) {
	this.maths1 = maths1;
}
public Integer getPhysics1() {
	return physics1;
}
public void setPhysicsl(Integer physics1) {
	this.physics1 = physics1;
}
public Integer getChemistry1() {
	return chemistry1;
}
public void setChemistry1(Integer chemistry1) {
	this.chemistry1 = chemistry1;
}
public Integer getEnglish2() {
	return english2;
}
public void setEnglish2(Integer english2) {
	this.english2 = english2;
}
public Integer getHindi2() {
	return hindi2;
}
public void setHindi2(Integer hindi2) {
	this.hindi2 = hindi2;
}
public Integer getMaths2() {
	return maths2;
}
public void setMaths2(Integer maths2) {
	this.maths2 = maths2;
}
public Integer getPhysics2() {
	return physics2;
}
public void setPhysics2(Integer physics2) {
	this.physics2 = physics2;
}
public Integer getChemistry2() {
	return chemistry2;
}
public void setChemistry2(Integer chemistry2) {
	this.chemistry2 = chemistry2;
}

public StudentMarks(Long id, Integer rollNo, Integer english1, Integer hindi1, Integer maths1, Integer physics1,
		Integer chemistry1, Integer english2, Integer hindi2, Integer maths2, Integer physics2, Integer chemistry2) {
	super();
	this.id = id;
	this.rollNo = rollNo;
	this.english1 = english1;
	this.hindi1 = hindi1;
	this.maths1 = maths1;
	this.physics1 = physics1;
	this.chemistry1 = chemistry1;
	this.english2 = english2;
	this.hindi2 = hindi2;
	this.maths2 = maths2;
	this.physics2 = physics2;
	this.chemistry2 = chemistry2;
}
@Override
public String toString() {
	return "StudentMarks [id=" + id + ", rollNo=" + rollNo + ", english1=" + english1 + ", hindi1=" + hindi1
			+ ", maths1=" + maths1 + ", physics1=" + physics1 + ", chemistry1=" + chemistry1 + ", english2=" + english2
			+ ", hindi2=" + hindi2 + ", maths2=" + maths2 + ", physics2=" + physics2 + ", chemistry2=" + chemistry2
			+ "]";
}



}
