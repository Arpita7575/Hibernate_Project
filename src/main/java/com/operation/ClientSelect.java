package com.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Book.class);
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Book book = session.load(Book.class, 1);
		System.out.println(book);
		

	}

}
