package com.sadaf.MyHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
	public static void main(String[] args) {

		// Create the session factory
		SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			Student tempStudent = new Student("Johnny", "Snow", "johnytest.com");

			// start transaction
			session.beginTransaction();
			session.save(tempStudent);
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
