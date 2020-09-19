package com.hb.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {


//		String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
//		Properties prop = new Properties();
//		prop.setProperty("user", "postgres");
//		prop.setProperty("password", "postgres");
//		prop.setProperty("currentSchema", "test");
//		Connection connection = DriverManager.getConnection(jdbcUrl, prop);
//		System.out.println(connection);

		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetails.class)
								.buildSessionFactory();
		
		Session session  = factory.getCurrentSession();
		
		try {
			
//			Instructor in = new Instructor("Pritam", "Rajput", "pritamrajput@gmail.com");
//			InstructorDetails id = new InstructorDetails("youtube.com/pritam", "Coding");
			
			Instructor in = new Instructor("Jyoti", "Thoke", "jo@gmail.com");
			InstructorDetails id = new InstructorDetails("youtube.com/jo", "Elex");
			
			in.setInstructorDetails(id);
			
			session.beginTransaction();
			
			System.out.println("saving data " + in);
			session.save(in);
					
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
