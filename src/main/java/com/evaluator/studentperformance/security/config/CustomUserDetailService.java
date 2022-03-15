package com.evaluator.studentperformance.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.evaluator.studentperformance.dao.IUserDetaildao;
import com.evaluator.studentperformance.model.PdfUserDetails;
import com.evaluator.studentperformance.model.UserDetail;


@Service
public class CustomUserDetailService implements UserDetailsService {
	
	@Autowired
	private IUserDetaildao userDetaildao;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		// user database
		
		final UserDetail user= this.userDetaildao.findByUserName(userName);
		 
		if(user==null)
		 {
			 System.out.println("User Not Found...");
			 throw new  UsernameNotFoundException("No User Found");
		 }
		else {
		 
			return new PdfUserDetails(user);
		}
	}
	
	 public void saveUser(UserDetail user) {
	       
		 userDetaildao.save(user);
	}
	
	 public boolean existsByUsername(String username)
	 {
		return userDetaildao.existsByUserName(username);
	 }
		
		
		
		
		
		//		if (userName.equals("Ajay")) {
//			return new UserDetails("Ajay", "ajay123" , new ArrayList<>());
//					
//		}else {
//			throw new UsernameNotFoundException("User not found !!");
//		}
		
		
	}


