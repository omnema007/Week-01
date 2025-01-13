import java.util.Scanner;

public class FactorialCalculatorUsingFor {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take an integer input
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Check if the number is a natural number
        if (num < 0) {
            System.out.println("Please enter a natural number (positive integer).");
        } else {
            long factorial = 1;  // Variable to store the factorial

            // Calculate the factorial using a for loop
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            // Print the result
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        // Close the scanner to prevent resource leak
        sc.close();
    }
}