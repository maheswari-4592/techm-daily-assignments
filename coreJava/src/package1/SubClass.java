package package1;

import constructors.Person;

public class SubClass extends Person 
{
    public void accessInfo() 
    {
        // Accessing age (protected instance variable) from the superclass
        System.out.println("Age: " + age);
        
        // Accessing address (default/package-private instance variable) from the superclass
        //System.out.println("Address: " + address);
    }

    public static void main(String[] args) 
    {
        SubClass s = new SubClass();
        s.age = 30; // Accessing age from the subclass
        //subclass.address = "123 Main St"; //not possible to access

        s.accessInfo();
    }
}
