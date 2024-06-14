package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {
	
	  @GetMapping("/welcome")
	  @RequestMapping(method = RequestMethod.GET,value="/welcome") 
	  public String welcome() 
	  { 
		  return "welcome to springboot";
	  }
	
	


}