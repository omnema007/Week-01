import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
// Creating a Scanner object to take input from the user
Scanner sc = new Scanner(System.in);

// Taking input from the user
System.out.print("Enter a positive integer: ");
int num = sc.nextInt();

// Check if the number is positive
if (num < 0) {
System.out.println("Please enter a positive integer.");
} else {
// Initializing factorial to 1
int factorial = 1;

// Using a while loop to calculate the factorial
while (num > 0) {
factorial *= num;
num--;
}

// Printing the factorial
System.out.println("Factorial is: " + factorial);
}

        
sc.close();
}
}