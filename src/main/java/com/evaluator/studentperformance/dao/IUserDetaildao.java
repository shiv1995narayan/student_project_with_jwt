package com.evaluator.studentperformance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluator.studentperformance.model.UserDetail;

@Repository
public interface IUserDetaildao extends JpaRepository<UserDetail, Long>{
	
	//username, it will return the user of given username
	public UserDetail findByUserName(String username);
	
	Boolean existsByUserName(String username);
	
	

}	
