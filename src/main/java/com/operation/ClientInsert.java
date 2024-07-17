package com.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Book.class);
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
//		Transaction transaction = session.beginTransaction();
//		Book book = new Book(3,"c",200);
//		session.save(book);
//		System.out.println("Inserted......");
//		transaction.commit();
		
		Transaction transaction= session.beginTransaction();
		Book book = new Book(4,"Pyhon",400);
		session.save(book);
		transaction.commit();
		
		System.out.println("Inserted......");

	}

}
