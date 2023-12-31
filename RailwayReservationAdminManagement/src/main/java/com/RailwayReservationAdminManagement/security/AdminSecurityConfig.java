package com.RailwayReservationAdminManagement.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity 
public class AdminSecurityConfig extends WebSecurityConfigurerAdapter
{
	
	@Override
	  protected void configure(AuthenticationManagerBuilder auth) throws Exception  { 
		  auth.inMemoryAuthentication()
		  		.withUser("shreya").password("password").roles("ADMIN"); 
	  }
	  
	  @Override 
	  protected void configure(HttpSecurity http) throws Exception  {
		  
		  http.httpBasic()
		  .and().authorizeRequests()
		  	  .antMatchers("/admin/add","/admin/update/**","/admin/delete/**","/admin/all","/admin/").permitAll()
              //.antMatchers("/admin/all","/admin/").permitAll()
		  	 // .antMatchers("/v3/api-docs/","/v2/api-docs/","/swagger-resources/**","/swagger-ui/**","/webjars/**").permitAll()
		  	  .and().csrf().disable().headers().frameOptions().disable(); 
		 }
	  
	  @Bean
	  public PasswordEncoder getPasswordEncoder() 
	  { 
		  return NoOpPasswordEncoder.getInstance(); 
	  } 

}