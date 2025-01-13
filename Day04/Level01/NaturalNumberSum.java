import java.util.Scanner;

public class NaturalNumberSum {

// Method to calculate the sum of n natural numbers
public static int calculateSum(int n) {
int sum = 0;
for (int i = 1; i <= n; i++) {
sum += i; // Add the current number to the sum
}
return sum;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Get user input
System.out.println("Enter a positive integer: ");
int n = sc.nextInt();


if (n <= 0) {
System.out.println("Please enter a positive integer.");
} else {
int sum = calculateSum(n);

// Display the result
System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
}

sc.close();
}
}