package com.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientSaveUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Book.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
//		Transaction transaction = session.beginTransaction();
//		
//		Book book = new Book(3,".Net",500);
//		session.saveOrUpdate(book);
//		transaction.commit();
//		
//		System.out.println("Updated.........");
		
		Transaction transaction = session.beginTransaction();
		Book book  = new Book(5,"C",555);
		session.saveOrUpdate(book);
		transaction.commit();
		
		System.out.println("Inserted...........");

	}

}
