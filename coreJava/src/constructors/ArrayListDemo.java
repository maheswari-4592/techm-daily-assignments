package constructors;

import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] args) 
    {
        // Creating an ArrayList to store strings
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to the ArrayList
        al.add("white");
        al.add("Green");
        al.add("pink");

        // Retrieving and printing elements from the ArrayList
        System.out.println("Colors in the list:");
        for (String color : al) {
            System.out.println(color);
        }
    }
}

