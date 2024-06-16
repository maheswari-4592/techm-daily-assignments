package com.techm.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

@EnableWebMvc
public class AppMain {

    public static void main(String[] args) {
        // Initialize Spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MyConfig.class);
        context.refresh();

        // Register and configure DispatcherServlet
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        ServletContext servletContext = ((ServletConfig) context).getServletContext();
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcherServlet", dispatcherServlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");

        // Shutdown hook to gracefully close the context
        context.registerShutdownHook();
    }
}
