import java.util.Scanner;

public class SumUntilZero {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Initialize total to 0.0
double total = 0.0;

// Variable to store user input
double userInput;

System.out.print("Enter a number (0 to stop): ");
userInput = sc.nextDouble();

// Loop while the input is not 0
while (userInput != 0) {
total += userInput; // Add the input to the total

// Ask for the next number
System.out.print("Enter a number (0 to stop): ");
userInput = sc.nextDouble();
        }

// Display the total sum
System.out.println("The total sum is: " + total);
    }
}