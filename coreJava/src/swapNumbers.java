import java.util.Scanner;

public class swapNumbers {
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap the numbers using arithmetic operations
        a = a + b;  
        b = a - b;  
        a = a - b;  

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
