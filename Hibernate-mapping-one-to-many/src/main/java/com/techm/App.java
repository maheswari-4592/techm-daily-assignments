package com.techm;

import java.util.HashSet;
import java.util.Set;

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
	 public static void main( String[] args )
	    {
	       
	    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

			Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

			SessionFactory factory = meta.getSessionFactoryBuilder().build();

			Session session = factory.openSession();
			
			Transaction t = session.beginTransaction();
			
			Set<Address> address = new HashSet<Address>();
			
			Address add1 = new Address();
			add1.setPlace("hyd");
			

			Address add2 = new Address();
			add2.setPlace("bnglr");
			
			address.add(add1);
			address.add(add2);
			
			
			Student stu = new Student();
			stu.setStname("shiva");
			stu.setAddress(address);
			
			
			session.save(stu);
			
			t.commit();
			System.out.println("successfully saved");
			
			factory.close();
			session.close();
      }
}
