package com.techm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techm.config.Myconfig;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
	   ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class); //java-based configuration
       Student student = context.getBean(Student.class);
       System.out.println(student);
    }
}
