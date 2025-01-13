import java.util.Scanner;

public class FizzBuzzInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        // Create a String array to store the results
        String[] results = new String[number + 1]; // Array size = number + 1 to include 0 to number

   
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz"; // Multiples of both 3 and 5
            } else if (i % 3 == 0) {
                results[i] = "Fizz"; // Multiples of 3
            } else if (i % 5 == 0) {
                results[i] = "Buzz"; // Multiples of 5
            } else {
                results[i] = String.valueOf(i); // Other numbers
            }
        }

        
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        scanner.close();
    }
}