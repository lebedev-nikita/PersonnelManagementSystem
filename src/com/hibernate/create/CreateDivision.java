// TODO: Удалить пакет?

package com.hibernate.create;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Division;

public class CreateDivision {
	public static void main(String[] args) 
	{
		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Division.class)
								 .buildSessionFactory();
		
		// create a session
		Session session = factory.getCurrentSession();
		
		try {
			// create a Division object
			System.out.println("Creating new Division object...");
			Division tempDivision = new Division("Web-design", 0, 1);
			
			// start a transaction
			session.beginTransaction();
			
			// save the Division object
			System.out.println("Saving the Division");
			session.save(tempDivision);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}
}
