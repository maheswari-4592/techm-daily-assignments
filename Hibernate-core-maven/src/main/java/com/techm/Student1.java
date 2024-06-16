package com.techm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Student1 {
	
	@Id //stid is a primary key column
	private int stid;
	
	private String stname;
	
	
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	
	public Student1(int stid, String stname) {
		super();
		this.stid = stid;
		this.stname = stname;
	}
	
	public Student1()
	{
		
	}

}
