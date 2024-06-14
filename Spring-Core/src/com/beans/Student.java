package com.beans;
public class Student {
	private int stid;
	private String stname;
	//setters and getters
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
	
	public Student()
	{
		
	}
	
	//constructor
	 public Student(int stid,String stname)
	 {
		 super();
		 System.out.println("constructor 1");
		 this.stid=stid;
		 this.stname=stname;
	 }

	//business logic method
	public void display()
	{
		System.out.println("student id is: " +stid);
		System.out.println("student name is: " +stname);
	}
}