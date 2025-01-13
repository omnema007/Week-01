import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Get the number and power as inputs
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Initialize the result variable to 1
        int result = 1;

        // Loop from 1 to the given power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by number in each iteration
        }

        // Print the result (number raised to the power)
        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}