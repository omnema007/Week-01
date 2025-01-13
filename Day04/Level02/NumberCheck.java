import java.util.Scanner;

public class NumberCheck {

// Method to check if a number is positive or negative
public static String isPositive(int number) {
if (number >= 0) {
return "positive";
} else {
return "negative";
}
}

// Method to check if a number is even or odd
public static String isEven(int number) {
if (number % 2 == 0) {
return "even";
} else {
return "odd";
}
}

// Method to compare two numbers
public static int compare(int number1, int number2) {
if (number1 > number2) {
return 1; // number1 is greater
} else if (number1 == number2) {
return 0; // numbers are equal
} else {
return -1; // number1 is smaller
}
}

public static void main(String[] args) {
// Create a scanner object for user input
Scanner sc = new Scanner(System.in);

int[] numbers = new int[5];

System.out.println("Enter 5 numbers:");
for (int i = 0; i < 5; i++) {
System.out.print("Enter number " + (i + 1) + ": ");
numbers[i] = sc.nextInt();
}

for (int i = 0; i < numbers.length; i++) {
String positivity = isPositive(numbers[i]);
if (positivity.equals("positive")) {
String evenOdd = isEven(numbers[i]);
System.out.println("Number " + numbers[i] + " is positive and " + evenOdd + ".");
} else {
System.out.println("Number " + numbers[i] + " is negative.");
}
}

        
int comparisonResult = compare(numbers[0], numbers[4]);
if (comparisonResult == 1) {
System.out.println("The first number is greater than the last number.");
} else if (comparisonResult == 0) {
System.out.println("The first number is equal to the last number.");
} else {
System.out.println("The first number is less than the last number.");
}

sc.close();
}
}
