package javalabcard1;
import java.util.Scanner;
public class AverageCalculator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        
	        double[] numbers = new double[n];
	        System.out.println("Enter the numbers:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextDouble();
	        }
	        
	        double average = calculateAverage(numbers);
	        System.out.println("Average: " + average);
	        
	        scanner.close();
	    }
	    
	    public static double calculateAverage(double[] numbers) {
	        double sum = 0;
	        for (double num : numbers) {
	            sum += num;
	        }
	        return sum / numbers.length;
	    }
	}