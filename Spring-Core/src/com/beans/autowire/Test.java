package com.beans.autowire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
	   ApplicationContext context = new 
			    ClassPathXmlApplicationContext("autowiring.xml");
	   
	   //Student student = (Student) context.getBean("stu"); //for reference type
	   //Student1 student = (Student1) context.getBean("stu"); //for annotation based wiring
	   Student2 student = (Student2) context.getBean("stu"); //for auto-discovery wiring
	   
		System.out.println(student);
	}

}