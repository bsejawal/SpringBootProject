package com.bsejawal.hibernate;

import java.util.Date;
import java.util.LinkedList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		
		StudentInfo student = new StudentInfo();
		student.setName("Bhesh Raj Sejawal");
		student.setRollNo(3);
		student.setDateOfBirth(new Date());
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		

	}

}
