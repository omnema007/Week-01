import java.util.Scanner;

public class OddEvenNumbers {
public static void main(String[] args) {
// Create a scanner object to take input from the user
 Scanner sc = new Scanner(System.in);

// Take an integer input
System.out.print("Enter a positive integer: ");
int number = sc.nextInt();

// Check if the number is a natural number
if (number <= 0) {
System.out.println("Please enter a natural number (positive integer).");
} else {
// Using a for loop to iterate from 1 to the number
for (int i = 1; i <= number; i++) {
// Check if the current number is odd or even
if (i % 2 == 0) {
System.out.println(i + " is even.");
} else {
System.out.println(i + " is odd.");
}
}
}

        
sc.close();
}
}