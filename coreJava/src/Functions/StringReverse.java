package Functions;

import java.util.Scanner;

public class StringReverse 
{
   
    public static String reverseString(String str) 
    {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = input.nextLine();

        String reversedString = reverseString(originalString);

        System.out.println("The reversed string is: " + reversedString);
    }
}
