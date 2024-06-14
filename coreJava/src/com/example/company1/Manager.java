package com.example.company1;

public class Manager 
{
    private String name;
    private int employeeId;

    public Manager(String name, int employeeId) 
    {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayDetails() 
    {
        System.out.println("Manager Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}