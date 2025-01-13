import java.util.Scanner;

public class SumUntilZeroOrNegative {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Initialize total to 0.0
double total = 0.0;

System.out.println("Enter numbers to sum (0 or a negative number to stop):");

// Infinite loop
while (true) {
System.out.print("Enter a number: ");
double userInput = sc.nextDouble();

// Check if the input is 0 or negative
if (userInput <= 0) {
break;
}

// Add user input to the total
 total += userInput;
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);
    }
}