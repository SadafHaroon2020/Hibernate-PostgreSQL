package com.sadaf.MyHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDemo {
	public static void main(String[] args) {
		Student student = new Student();

		student.setEmail("sadaf@gmail.com");
		student.setFirstName("Sadaf");
		student.setLastName("Harry");
		student.setId(3);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction ts = session.beginTransaction();
		session.save(student);
		ts.commit();
	}

}
