package com.evaluator.studentperformance.rest.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evaluator.studentperformance.dao.IUserDetaildao;
import com.evaluator.studentperformance.model.JwtRequest;
import com.evaluator.studentperformance.model.JwtResponse;
import com.evaluator.studentperformance.model.UserDetail;
import com.evaluator.studentperformance.security.config.CustomUserDetailService;
import com.evaluator.studentperformance.security.config.JwtUtil;

@RestController
@CrossOrigin(origins = "*")
public class JwtController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private CustomUserDetailService customUserDetailsService;

	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	IUserDetaildao userdao;

	@PostMapping("/token")
	public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception {

		System.out.println(jwtRequest);
		try {
				authenticate(jwtRequest.getUsername(), jwtRequest.getPassword());

		} catch (UsernameNotFoundException e) {
			e.printStackTrace();
			throw new Exception("Bad Credentials");

		}
		
		// fine area..

				UserDetails userDetails = this.customUserDetailsService.loadUserByUsername(jwtRequest.getUsername());

				String token = this.jwtUtil.generateToken(userDetails);

				System.out.print("JWT"+token);

				// {"token" : "value"}

				return ResponseEntity.ok(new JwtResponse(token));


	}
	

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@RequestBody UserDetail register) {
		if (customUserDetailsService.existsByUsername(register.getUserName())) {
			return ResponseEntity.ok("Error: Username is already taken!");
		}
		customUserDetailsService.saveUser(register);
			return ResponseEntity.ok("registration successfull");
	}
		
		private void authenticate(String username,String password) throws Exception {
			
			try {
				
				authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password)); 
				
			} catch (DisabledException e) {
				
				throw new Exception("User Disable"+e.getMessage());
			
			}catch (BadCredentialsException e) {

				e.printStackTrace();
				throw new Exception("Bad Credentials");

			}
			
		}


}

