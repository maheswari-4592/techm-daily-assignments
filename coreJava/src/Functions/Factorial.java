package Functions;

import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        long factorial = calculateFactorial(number);
        
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int n) 
    {
        if (n == 0) 
        {
            return 1;
        }
        
        long factorial = 1;
        for (int i = 1; i <= n; i++)
        {
            factorial *= i;
        }
        
        return factorial;
    }
}
