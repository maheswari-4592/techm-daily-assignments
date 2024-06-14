
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {

		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter first no:");
			int fno = s.nextInt();
			System.out.println("enter second no:");
			int sno = s.nextInt();
			int z = fno / sno;
			System.out.println("division is : " + z);
		}

		catch (RuntimeException re) {
			if (re instanceof ArithmeticException) 
			{
				System.out.println("don't enter zero as denominator");
			} else if (re instanceof InputMismatchException) 
			{
				System.out.println("please pass only numeric values");
			}
		}
		
	}

}