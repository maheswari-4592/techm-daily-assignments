package com.techm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello1")
    @ResponseBody
    public String hello() {
        return "Hello, Spring MVC!";
    }
}
