package ControlFlowStatements;

import java.util.Scanner;

public class StringReverse 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String originalString = input.nextLine();
        
        String reversedString = "";
        
        for (int i = originalString.length() - 1; i >= 0; i--) 
        {
            reversedString += originalString.charAt(i);
        }
        
        System.out.println("The reversed string is: " + reversedString);
    }
}
