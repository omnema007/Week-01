import java.util.Scanner;

public class LargestAndSecondLargest {

public static void main(String[] args) {
// Create a scanner object for user input
Scanner sc = new Scanner(System.in);

// Take user input for the number
System.out.print("Enter a number: ");
int number = sc.nextInt();

// Define the array to store the digits (maximum 10 digits)
int maxDigits = 10;
int[] digits = new int[maxDigits];
int index = 0;

while (number != 0 && index < maxDigits) {
digits[index] = number % 10; 
number = number / 10; 
index++;
}

int largest = -1;
int secondLargest = -1;

// Loop through the array to find the largest and second largest digits
for (int i = 0; i < index; i++) {
if (digits[i] > largest) {
secondLargest = largest;
largest = digits[i];
} else if (digits[i] > secondLargest && digits[i] != largest) {
secondLargest = digits[i];
}
}

// Display the largest and second largest digits
if (largest != -1 && secondLargest != -1) {
System.out.println("The largest digit is: " + largest);
System.out.println("The second largest digit is: " + secondLargest);
} else {
System.out.println("Not enough distinct digits to find the second largest.");
}

        
sc.close();
}
}
