package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find 
{
	public static void main(String[] args) 
	{

	   List<String> names = Arrays.asList("Philip","Teja","Anjali","Lakshmi","Anu","Mahi");
	 	
	   List<String> filterdNames = names.stream().filter(x->x.startsWith("A")).collect(Collectors.toList());
       System.out.println(filterdNames);
	}
   
}
