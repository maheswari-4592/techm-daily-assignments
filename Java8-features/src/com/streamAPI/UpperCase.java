package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase 
{
	public static void main(String[] args) {
		
		
	  List<String> names = Arrays.asList("Philip","Teja","Kushvanth","Lakshmi","Ibrahim","Mahi");
		  
		  
	  List<String> upperCaseNames = names.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
	  System.out.println(upperCaseNames);
}
	
}
