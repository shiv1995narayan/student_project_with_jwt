package com.evaluator.studentperformance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserDetail")
public class UserDetail{
   
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String fullName;
  private String userName;
 
  private String contactNo;
  private String email;
  private String password;
  
  
  
public UserDetail() {
	super();
	// TODO Auto-generated constructor stub
}



public UserDetail(String fullName, String userName, String contactNo, String email, String password) {
	super();
	this.fullName = fullName;
	this.userName = userName;
	this.contactNo = contactNo;
	this.email = email;
	this.password = password;
}



public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public String getFullName() {
	return fullName;
}



public void setFullName(String fullName) {
	this.fullName = fullName;
}



public String getUserName() {
	return userName;
}



public void setUserName(String userName) {
	this.userName = userName;
}



public String getContactNo() {
	return contactNo;
}



public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



@Override
public String toString() {
	return "UserDetail [id=" + id + ", fullName=" + fullName + ", userName=" + userName + ", contactNo=" + contactNo
			+ ", email=" + email + ", password=" + password + "]";
}
  
   
  

}

