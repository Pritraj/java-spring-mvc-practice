package com.hb;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hb.entity.Student;

public class TestHB {

	public static void main(String[] args) {

		Student student = new Student(4, "Pritam", "Rajput", "p@gmail.com");
		insert(student);
		get();

	}

	private static void get() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		try {
			
			Session s = factory.getCurrentSession();
			s.beginTransaction();

			List<Student> students = s.createQuery("from Student").list();
			for (Student stu : students) {
				System.out.println(stu);
			}

		} catch (Exception e) {
			factory.close();
			e.printStackTrace();
		}

	}

	private static void insert(Student student) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		try {
			Session s = factory.getCurrentSession();
			s.beginTransaction();
			s.save(student);
			s.getTransaction().commit();
		} catch (Exception e) {
			factory.close();
			e.printStackTrace();
		}
	}

}
