package com.techm;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);//java-based configuration
    	
    	StudentDao dao  = context.getBean(StudentDao.class);
    	Student obj = new Student();
    	//obj.setStid(201);
    	//obj.setStname("maahi");
    	
    	//int x = dao.saveStudent(obj);
    	//System.out.println(x + "row(s) inserted");
    	
    	//for getting list of all students
        List<Student> students = dao.listStudents();
    	
    	for(Student s:students)
    	{
    		System.out.println(s.getStid() + " " + s.getStname());
    	}
    	
    }
}