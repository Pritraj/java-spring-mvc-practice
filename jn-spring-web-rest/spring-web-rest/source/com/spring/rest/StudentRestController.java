package com.spring.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	@GetMapping("/list")
	public List<Student> getStudent() {
		List<Student> sl = new ArrayList<Student>();
		sl.add(new Student("Pritam", "Rajput"));
		sl.add(new Student("Bla", "Bla"));
		return sl;
	}
	
}
