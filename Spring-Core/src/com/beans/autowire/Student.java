//autowire with the attributes ---byName[getters and setters are required] and byType[not compulsory]
//autowire with attribute ---constructor[need constructor method]
package com.beans.autowire;


public class Student {
	
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
     //constructor
	public Student(Address address) {
		super();
		this.address = address;
	}

	public String toString()
	{
		return  " " + address;
	}
	
}