package com.evaluator.studentperformance.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.studentperformance.service.impl.IStudentService;
import com.studentperformance.service.impl.StudentServiceImpl;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private JwtAuthenticationFilter jwtFilter;

	@Autowired
	private CustomUserDetailService customUserDetailService;

	@Autowired
	private JwtAuthenticationEntryPoint unauthoriedHandler;
	
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {

		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(customUserDetailService);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
		.csrf()
		.disable()
		.cors()
		.disable()
		.authorizeRequests()
		.antMatchers("/token")
		.permitAll().antMatchers("/signup")
		.permitAll().antMatchers("/creatstudent")
		.permitAll().antMatchers("/getstudentdata")
		.permitAll().antMatchers("/creatstudentMarks")
		.permitAll().antMatchers("/getstudentMarks")
		.permitAll().antMatchers("/creatstudentAchievement")
		.permitAll().antMatchers("/getStudentAchievement")
		.permitAll().anyRequest()
		.authenticated()
		.and().exceptionHandling().authenticationEntryPoint(unauthoriedHandler).and()
		.sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS);

		http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
		
	}
	
	 @Bean
	    public UserDetailsService mongoUserDetails() {
	        return new CustomUserDetailService();
	    }
	
	@Bean
		public IStudentService studentDetails() {
		return new StudentServiceImpl();
	}

}
