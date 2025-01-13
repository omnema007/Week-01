

import java.util.Scanner;

public class MultiplesOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Get the number as input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Run a for loop backward from i = 100 to i = 1
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) { // Check if i is a multiple of number
                System.out.println(i); // Print i if it is a multiple
            }
        }
    }
}