//autodisovery:

package com.beans.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stu")//for autodiscovery ,we need to pass bean here
public class Student2 {
	
	
	@Autowired
	private Address address;
	
	public String toString()
	{
		return  " " + address;
	}
	
}