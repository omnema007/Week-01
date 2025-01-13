import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Scanner to get user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        
        // Check if the number is positive
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop through numbers from 1 to the given number
            for (int i = 1; i <= num; i++) {
                // Check for multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
        
        sc.close();
    }
}