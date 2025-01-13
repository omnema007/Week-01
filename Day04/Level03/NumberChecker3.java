import java.util.Scanner;

public class NumberChecker3 {

// Method to find the count of digits in the number
public static int countDigits(int number) {
int count = 0;
number = Math.abs(number); 
if (number == 0) {
return 1; 
}
while (number > 0) {
number /= 10;
count++;
}
return count;
}

// Method to store the digits of the number in a digits array
public static int[] getDigitsArray(int number) {
int digitCount = countDigits(number);
int[] digits = new int[digitCount];
int index = 0;
number = Math.abs(number); // Remove negative sign if any
while (number > 0) {
digits[index++] = number % 10; // Get last digit and store it in the array
number /= 10; // Remove last digit
}
return digits;
}

// Method to reverse the digits array
public static int[] reverseDigitsArray(int[] digits) {
int[] reversed = new int[digits.length];
int j = 0;
for (int i = digits.length - 1; i >= 0; i--) {
reversed[j++] = digits[i];
}
return reversed;
}

// Method to compare two arrays and check if they are equal
public static boolean areArraysEqual(int[] arr1, int[] arr2) {
if (arr1.length != arr2.length) {
return false;
}
for (int i = 0; i < arr1.length; i++) {
if (arr1[i] != arr2[i]) {
return false;
}
}
return true;
}

// Method to check if a number is a palindrome using the digits array
public static boolean isPalindrome(int number) {
int[] digits = getDigitsArray(number);
int[] reversedDigits = reverseDigitsArray(digits);
return areArraysEqual(digits, reversedDigits);
}

// Method to check if a number is a duck number
public static boolean isDuckNumber(int number) {
int[] digits = getDigitsArray(number);
for (int i = 0; i < digits.length; i++) {
if (digits[i] == 0 && i != 0) { // Check if there's a zero after the first digit
return true;
}
}
return false;
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter the number: ");
int number = sc.nextInt(); // Example number

// Count of digits
int count = countDigits(number);
System.out.println("Count of digits: " + count);

// Digits array
int[] digits = getDigitsArray(number);
System.out.print("Digits array: ");
for (int digit : digits) {
System.out.print(digit + " ");
}
System.out.println();

// Reversed digits array
int[] reversedDigits = reverseDigitsArray(digits);
System.out.print("Reversed digits array: ");
for (int digit : reversedDigits) {
System.out.print(digit + " ");
}
System.out.println();

// Check if the number is a palindrome
boolean palindrome = isPalindrome(number);
System.out.println("Is Palindrome: " + palindrome);

// Check if the number is a duck number
boolean duckNumber = isDuckNumber(number);
System.out.println("Is Duck Number: " + duckNumber);

sc.close();
}
}
