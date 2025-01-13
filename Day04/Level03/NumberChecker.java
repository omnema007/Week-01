import java.util.Scanner;

public class NumberChecker {

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
digits[index++] = number % 10; // Get last digit and store it in the array
number /= 10; // Remove last digit
}
return digits;
}

// Method to check if a number is a duck number
public static boolean isDuckNumber(int number) {
int[] digits = getDigitsArray(number);
for (int i = 0; i < digits.length; i++) {
if (digits[i] == 0 && i != 0) { 
return true;
}
}
return false;
}

// Method to check if a number is an Armstrong number
public static boolean isArmstrongNumber(int number) {
int[] digits = getDigitsArray(number);
int sum = 0;
int power = digits.length; 
for (int digit : digits) {
sum += Math.pow(digit, power);
}
return sum == number;
}

// Method to find the largest and second largest elements in the digits array
public static int[] findLargestAndSecondLargest(int[] digits) {
int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;
for (int digit : digits) {
if (digit > largest) {
secondLargest = largest;
largest = digit;
} else if (digit > secondLargest && digit != largest) {
secondLargest = digit;
}
}
return new int[] { largest, secondLargest };
}

// Method to find the smallest and second smallest elements in the digits array
public static int[] findSmallestAndSecondSmallest(int[] digits) {
int smallest = Integer.MAX_VALUE;
int secondSmallest = Integer.MAX_VALUE;
for (int digit : digits) {
if (digit < smallest) {
secondSmallest = smallest;
smallest = digit;
} else if (digit < secondSmallest && digit != smallest) {
secondSmallest = digit;
}
}
return new int[] { smallest, secondSmallest };
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter the number: ");
int number = sc.nextInt(); 

System.out.println("Number: " + number);

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

// Duck number check
boolean isDuck = isDuckNumber(number);
System.out.println("Is Duck Number: " + isDuck);

// Armstrong number check
boolean isArmstrong = isArmstrongNumber(number);
System.out.println("Is Armstrong Number: " + isArmstrong);

// Largest and second largest digits
int[] largestTwo = findLargestAndSecondLargest(digits);
System.out.println("Largest digit: " + largestTwo[0]);
System.out.println("Second largest digit: " + largestTwo[1]);

// Smallest and second smallest digits
int[] smallestTwo = findSmallestAndSecondSmallest(digits);
System.out.println("Smallest digit: " + smallestTwo[0]);
System.out.println("Second smallest digit: " + smallestTwo[1]);

sc.close();
}
}
