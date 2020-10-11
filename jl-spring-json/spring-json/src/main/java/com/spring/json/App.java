package com.spring.json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main( String[] args ){
    	try {
			// create object mapper
    		ObjectMapper om = new ObjectMapper(); 
    		//read json
    		Student student = om.readValue(new File("data/sample.json"), Student.class);
    		
    		//print data
    		System.out.println("First Name: " + student.getFirstName());
    		System.out.println("Last Name: " + student.getLastName());
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
