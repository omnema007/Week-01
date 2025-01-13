import java.util.Scanner;
public class SwappedNumbers {
public static void main(String[] args) {

//create scanner object to take user input
Scanner sc = new Scanner(System.in);

//take input form the user
System.out.println("Enter first number: ");
int number1 = sc.nextInt();

System.out.println("Enter second number: ");
int number2 = sc.nextInt();

// Display the numbers before swapping
System.out.println("Before swapping: number1 = " + number1 + ", number2 = " + number2);

// Swap the numbers
int temp = number1; // Use a temporary variable
number1 = number2;
number2 = temp;

// Display the numbers after swapping
System.out.println("After swapping: number1 = " + number1 + ", number2 = " + number2);

sc.close();
}
}

