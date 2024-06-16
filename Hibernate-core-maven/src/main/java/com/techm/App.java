package com.techm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		
		//need while using hibernate.cfg.xml file
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.config.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		//inserting into sql database
		
				Student1 e = new Student1();
				e.setStid(106);
				e.setStname("priya");
				session.save(e);	
				t.commit();
				System.out.println("successfully saved"); 
				
				//fetching student details from database
		        Student1 student = session.get(Student1.class, 104);
				System.out.println("retrieved student is : " +student.getStid()+ " - "+ student.getStname());
				session.close();
				
				factory.close();
				
	}
}

				
