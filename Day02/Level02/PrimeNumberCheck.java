import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Variable to store if the number is prime or not
        boolean isPrime = true;
        
        // Prime check for numbers greater than 1
        if (num <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            // Loop through numbers from 2 to num - 1
            for (int i = 2; i < num; i++) {
                // If the number is divisible by any number other than 1 and itself
                if (num % i == 0) {
                    isPrime = false;
                    break; // No need to check further
                }
            }
        }
        
        // Output the result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        scanner.close();
    }
}