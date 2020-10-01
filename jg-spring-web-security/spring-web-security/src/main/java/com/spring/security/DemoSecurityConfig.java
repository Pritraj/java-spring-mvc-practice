package com.spring.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		// add users for in memory auth
		UserBuilder ub = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
			.withUser(ub.username("Pritam").password("Pritam").roles("EMPLOYEE"))
			.withUser(ub.username("Shubham").password("Shubham").roles("MANAGER"))
			.withUser(ub.username("JO").password("JO").roles("ADMIN"));
	}
	
	

}
