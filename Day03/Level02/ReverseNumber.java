import java.util.Scanner;

public class ReverseNumber {

public static void main(String[] args) {
// Create a scanner object for user input
Scanner sc = new Scanner(System.in);

// Take user input for the number
System.out.print("Enter a number: ");
int number = sc.nextInt();

int temp = number;
int digitCount = 0;
while (temp != 0) {
temp = temp / 10;
digitCount++;
}

// Create an array to store the digits of the number
int[] digits = new int[digitCount];
temp = number; 

// Extract digits and store them in the array
for (int i = 0; i < digitCount; i++) {
digits[i] = temp % 10;  // Get the last digit
temp = temp / 10;  // Remove the last digit
}

//  Create an array to store the digits in reverse order
int[] reversedDigits = new int[digitCount];

// Reverse the digits and store them in the reversedDigits array
for (int i = 0; i < digitCount; i++) {
reversedDigits[i] = digits[digitCount - 1 - i];
}

// Display the reversed number
System.out.print("Reversed number: ");
for (int i = 0; i < digitCount; i++) {
System.out.print(reversedDigits[i]);
}

sc.close();
}
}