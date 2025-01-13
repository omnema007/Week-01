import java.util.Scanner;

public class FizzBuzzUsingWhile {
    public static void main(String[] args) {
        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a positive number: ");
        int num = scanner.nextInt();
        
        // Check if the number is positive
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize counter variable
            int i = 1;
            
            // Loop through numbers from 1 to the given number using a while loop
            while (i <= num) {
                // Check for multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                
                // Increment the counter variable
                i++;
            }
        }
        
        scanner.close();
    }
}