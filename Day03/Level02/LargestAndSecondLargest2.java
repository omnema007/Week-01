import java.util.Scanner;

public class LargestAndSecondLargest2 {

public static void main(String[] args) {
// Create a scanner object for user input
Scanner sc = new Scanner(System.in);

// Take user input for the number
System.out.print("Enter a number: ");
int number = sc.nextInt();

int maxDigits = 10;
int[] digits = new int[maxDigits];
int index = 0;

while (number != 0) {
            
if (index == maxDigits) {
maxDigits += 10;  
int[] temp = new int[maxDigits];  // Create a new array with the updated size
for (int j = 0; j < digits.length; j++) {
temp[j] = digits[j];
}
  
digits = temp;  // Assign the new array to the digits
}

digits[index] = number % 10; // Get the last digit
number = number / 10; // Remove the last digit
index++;
}

// Variables to store the largest and second largest digit
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
