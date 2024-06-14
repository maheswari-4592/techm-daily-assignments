package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
	   ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
	   
	   
	   
	    Student student = (Student) context.getBean("stu");
	    
	    //used if we didnot used either setter or constructor injection in applicationcontext.xml
	   /*
		student.setStid(100);
		student.setStname("mahi");
		*/
		student.display();
	}

}