package com.hb.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainDelete {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetails.class)
								.buildSessionFactory();
		
		Session session  = factory.getCurrentSession();
		
		try {

			session.beginTransaction();
			
			int id = 1;
			Instructor temp = session.get(Instructor.class, id);
			
			if(temp != null) {
				session.delete(temp);
			}
			
			System.out.println(temp);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
