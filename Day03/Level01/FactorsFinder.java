import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the input for a number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        // Initialize variables
        int maxFactor = 10; 
        int[] factors = new int[maxFactor];
        int index = 0; 

        // Find the factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Check if the array needs to be resized
                if (index == maxFactor) {
                    maxFactor *= 2; 
                    int[] temp = new int[maxFactor]; 
					
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
 
                    factors = temp; 
                }
				
                factors[index++] = i; 
            }
        }

        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}