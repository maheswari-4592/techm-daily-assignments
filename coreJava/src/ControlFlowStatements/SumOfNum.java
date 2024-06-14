package ControlFlowStatements;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a integer : ");
        int n = input.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
