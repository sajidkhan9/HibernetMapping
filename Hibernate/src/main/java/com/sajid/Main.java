package com.sajid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configuration()
				.configure()
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Name name = new Name("a","b","c","d");
		Employee emp = new Employee(name, 100,"sajid.com");
		session.save(emp);
		session.getTransaction().commit();
		
		
	}

}
