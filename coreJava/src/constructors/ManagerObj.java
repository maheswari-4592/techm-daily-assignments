package constructors;

import com.example.company1.Manager;

public class ManagerObj 
{
    public static void main(String[] args)
    {
        Manager manager = new Manager("smith", 346766); // Attempting to create an object of Manager class
        manager.displayDetails();
    }
}