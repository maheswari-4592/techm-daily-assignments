package Functions;

public class Average 
{
    public static void main(String[] args) 
    {
        int[] numbers = {5, 15, 12, 25, 45};
        double average = calculateAverage(numbers);
        System.out.println("The average of the array elements is: " + average);
    }

    public static double calculateAverage(int[] arr) 
    {
        int sum = 0;
        for (int num : arr) 
        {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
