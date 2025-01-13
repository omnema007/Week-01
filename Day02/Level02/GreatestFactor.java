import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Get the integer input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define the greatestFactor variable and assign it to 1
        int greatestFactor = 1;

        // Loop from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Check if the number is divisible by i
                greatestFactor = i; // Assign i to greatestFactor
                break; // Exit the loop once the greatest factor is found
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
    }
}