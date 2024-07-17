package com.oneToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FacultySubjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure();
	    cfg.addAnnotatedClass(Faculty.class);
	    cfg.addAnnotatedClass(FacultySubject.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Faculty f1 = new Faculty("TKAFaculty");
		FacultySubject s1 = new FacultySubject("java");
		FacultySubject s2 = new FacultySubject("Python");
		FacultySubject s3 = new FacultySubject("Mern");
		FacultySubject s4 = new FacultySubject("Mean");

		ArrayList<FacultySubject> slist = new ArrayList<FacultySubject>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		
		session.save(f1);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);

		tx.commit();
		session.close();
		System.out.println("Process done..........");

	}

}
