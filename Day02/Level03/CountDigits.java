import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        // Step 1: Get an integer input for the number variable
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Step 2: Create an integer variable count with value 0
        int count = 0;

        // Step 3: Use a loop to iterate until number is not equal to 0
        while (number != 0) {
            // Step 4: Remove the last digit from number in each iteration
            number /= 10;

            // Step 5: Increase count by 1 in each iteration
            count++;
        }

        // Step 6: Finally, display the count to show the number of digits
        System.out.println("The number of digits is: " + count);

        scanner.close();
    }
}