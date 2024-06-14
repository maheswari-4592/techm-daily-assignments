
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList to store elements of different data types
        ArrayList<Object> al = new ArrayList<>();

        // Adding elements of different data types to the ArrayList
        al.add(10);  
        al.add("Hello");  
        al.add(3.14);  
        al.add(true); 


        for (Object element : al) {
            System.out.println(element);
        }
    }
}
