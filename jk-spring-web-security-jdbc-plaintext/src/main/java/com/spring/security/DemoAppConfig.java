package com.spring.security;

import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.spring")
@PropertySource("classpath:connection.properties")
public class DemoAppConfig {
	
	// setup variable to hold properties
	
	@Autowired
	private Environment env;
	
	
	// setup logger
	
	private Logger logger = Logger.getLogger(getClass().getName());

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver irv = new InternalResourceViewResolver();
		irv.setPrefix("/WEB-INF/view/");
		irv.setSuffix(".jsp");
		return irv;
	}
	
	// Define bean for security datasource
	
	@Bean
	public DataSource securityDataSource() {
		
		//create connection pool
		ComboPooledDataSource securituDataSource = new ComboPooledDataSource();
		//set jdbc driver class
		try {
			securituDataSource.setDriverClass(env.getProperty("jdbc.driver"));
		} catch (PropertyVetoException e) {
			throw new RuntimeException(e);
		}
		
		//log the connection properties
		logger.info(">>>> jdbc.url=" + env.getProperty("jdbc.url"));
		logger.info(">>>> jdbc.user=" + env.getProperty("jdbc.user"));
		
		//set the db connection props
		
		securituDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		securituDataSource.setUser(env.getProperty("jdbc.user"));
		securituDataSource.setPassword(env.getProperty("jdbc.password"));
		
		//set connection pool props
		
		return securituDataSource;
	}
}