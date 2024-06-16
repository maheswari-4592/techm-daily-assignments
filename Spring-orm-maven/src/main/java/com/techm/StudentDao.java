package com.techm;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDao {
	
	@Autowired //for java based configuration
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int saveStudent(Student student)
	{
		return (Integer) hibernateTemplate.save(student);
	}
	
	//for getting list of all students
	@Transactional
    public List<Student> listStudents() {
       return hibernateTemplate.loadAll(Student.class);
    }

}
