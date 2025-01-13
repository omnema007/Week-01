import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Extract the digits from the number and store the frequency
        while (number > 0) {
            int digit = (int) (number % 10);  
            frequency[digit]++;  
            number = number / 10;  
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        
        sc.close();
    }
}
