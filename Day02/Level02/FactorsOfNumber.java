import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Get the number as input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Run a for loop from i = 1 to i < number
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if number is divisible by i
                System.out.println(i); // Print i if it's a factor
            }
        }
        // Optionally, print the number itself as a factor (since every number is divisible by itself)
        System.out.println(number);
    }
}