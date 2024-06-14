
public class AgeValidation 
{
    public static void main(String[] args) {
        int age = 25;

        try {
            validateAge(age);
            System.out.println("Age validation successful. Age is: " + age);
        } 
        catch (InvalidAgeException e) 
        {
            System.out.println("InvalidAgeException caught: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) 
        {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
    }
}
