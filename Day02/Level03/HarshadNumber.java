import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
        // Step 1: Get an integer input for the number variable
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Create an integer variable sum with initial value 0
        int sum = 0;
        int originalNumber = number;

        // Step 3: Create a while loop to access each digit of the number
        while (number != 0) {
            // Step 4: Add each digit of the number to sum
            sum += number % 10;

            // Remove the last digit from the number
            number /= 10;
        }

        // Step 5: Check if the number is perfectly divisible by the sum
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        scanner.close();
    }
}