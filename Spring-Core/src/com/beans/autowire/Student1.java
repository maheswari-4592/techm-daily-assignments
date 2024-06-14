//annotation based wiring:

package com.beans.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Student1 
{
	@Autowired
	private Address address;
	
	

	public String toString()
	{
		return  " " + address;
	}
}
