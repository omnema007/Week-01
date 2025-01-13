import java.util.Scanner;

public class NumberChecker2 {

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
number = Math.abs(number); 
while (number > 0) {
digits[index++] = number % 10;
number /= 10; // Remove last digit
}
return digits;
}

// Method to find the sum of the digits of the number
public static int sumOfDigits(int number) {
int[] digits = getDigitsArray(number);
int sum = 0;
for (int digit : digits) {
sum += digit;
}
return sum;
}

// Method to find the sum of the squares of the digits of the number
public static double sumOfSquaresOfDigits(int number) {
int[] digits = getDigitsArray(number);
double sumOfSquares = 0;
for (int digit : digits) {
sumOfSquares += Math.pow(digit, 2);
}
return sumOfSquares;
}

// Method to check if a number is a Harshad number
public static boolean isHarshadNumber(int number) {
int sum = sumOfDigits(number);
return number % sum == 0;
}

// Method to find the frequency of each digit in the number
public static int[][] digitFrequency(int number) {
int[] digits = getDigitsArray(number);
int[][] frequency = new int[10][2]; // 10 digits (0-9)
        
// Initialize the frequency array with the digit and count 0
for (int i = 0; i < 10; i++) {
frequency[i][0] = i; // Digit is stored in first column
frequency[i][1] = 0; // Initial frequency is 0
}
        
// Count the frequency of each digit
for (int digit : digits) {
frequency[digit][1]++; // Increase the frequency count
}
        
return frequency;
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter the number: ");
int number = sc.nextInt(); 

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

// Sum of digits
int sumDigits = sumOfDigits(number);
System.out.println("Sum of digits: " + sumDigits);

// Sum of squares of digits
double sumSquares = sumOfSquaresOfDigits(number);
System.out.println("Sum of squares of digits: " + sumSquares);

// Harshad number check
boolean isHarshad = isHarshadNumber(number);
System.out.println("Is Harshad Number: " + isHarshad);

// Frequency of each digit
int[][] frequency = digitFrequency(number);
System.out.println("Digit frequencies: ");
for (int i = 0; i < 10; i++) {
if (frequency[i][1] > 0) { // Print only digits that appear
System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1]);
}
}

sc.close();
}
}
