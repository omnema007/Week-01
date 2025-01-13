import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        // Step 1: Get an integer input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Initialize sum variable to 0 and originalNumber variable to the input number
        int sum = 0;
        int originalNumber = number;

        // Step 3: Use a while loop to process each digit of the number
        while (originalNumber != 0) {
            // Step 4: Find the last digit using modulus operator
            int digit = originalNumber % 10;

            // Step 5: Cube the digit and add it to the sum
            sum += Math.pow(digit, 3);

            // Step 6: Remove the last digit from the original number
            originalNumber /= 10;
        }

        // Step 7: Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}