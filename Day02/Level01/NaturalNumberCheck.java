import java.util.Scanner;
public class NaturalNumberCheck {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Input a number
System.out.print("Enter a number: ");
int number = sc.nextInt();

// Check if the number is a natural number
if (number >= 0) {
// Calculate the sum of n natural numbers
int sum = number * (number + 1) / 2;
System.out.println("The sum of " + number + " natural numbers is " + sum);
} else {
System.out.println("The number " + number + " is not a natural number.");
}
}
}