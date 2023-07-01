package javalabcard1;

public class PrimeChecker {
	    public static void main(String[] args) {
	        int number = 19; // The number to check for primality
	        
	        boolean isPrime = checkPrime(number);
	        
	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }
	    
	    // Function to check whether a number is prime or not
	    public static boolean checkPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        
	        // Check for divisibility from 2 to the square root of the number
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false; // Not a prime number
	            }
	        }
	        
	        return true; // Prime number
	    }
	}