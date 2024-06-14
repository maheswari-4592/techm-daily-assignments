package com.techm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        App app = new App();
        app.insertData(jdbcTemplate, 3,"John Doe", 25);
        app.queryData(jdbcTemplate, 4);
    }

    public void insertData(JdbcTemplate jdbcTemplate,int id, String name, int age) {
        String sql = "INSERT INTO student (id,name, age) VALUES (?,?, ?)";
        try {
			jdbcTemplate.update(sql, id ,  name, age);
            System.out.println("Data inserted successfully.");
        } catch (DataAccessException e) {
            System.err.println("Error occurred while inserting data: " + e.getMessage());
            // Additional error handling logic such as logging, rethrowing, etc.
        }
    }

    public void queryData(JdbcTemplate jdbcTemplate, int id) {
        String sql = "SELECT name FROM student WHERE id = ?";
        try {
            String name = jdbcTemplate.queryForObject(sql, new Object[]{id}, String.class);
            System.out.println("Student name: " + name);
        } catch (DataAccessException e) {
            System.err.println("Error occurred while querying data: " + e.getMessage());
            // Additional error handling logic such as logging, rethrowing, etc.
        }
    }
}
