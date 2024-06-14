package Functions;

import java.util.Scanner;

public class PrimeNum 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        boolean isPrime = checkPrime(number);
        
        if (isPrime)
{
            System.out.println(number + " is a prime number.");
        } else 
        {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean checkPrime(int n) 
    {
        if (n <= 1) 
        {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) 
        {
            if (n % i == 0) 
            {
                return false;
            }
        }
        
        return true;
    }
}
