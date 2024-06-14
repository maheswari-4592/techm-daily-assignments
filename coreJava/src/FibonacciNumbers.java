import java.util.Scanner;

public class FibonacciNumbers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 0; i < n; i++) 
        {
            if (i == 0) {
                System.out.print(a + " ");
            } else if (i == 1) 
            {
                System.out.print(b + " ");
            } else 
            {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
}
