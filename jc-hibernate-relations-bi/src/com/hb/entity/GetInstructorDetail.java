package com.hb.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetInstructorDetail {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetails.class)
								.buildSessionFactory();
		
		Session session  = factory.getCurrentSession();
		
		try {

			session.beginTransaction();
			
			int theId = 5;
			InstructorDetails instructorDetails = session.get(InstructorDetails.class, theId);
			System.out.println(instructorDetails.getInstructor());
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
		

	}

}
