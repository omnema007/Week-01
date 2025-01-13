import java.util.Scanner;
public class QuotientAndRemainder {
public static void main(String[] args) {

//create scanner object to take user input
Scanner sc = new Scanner(System.in);

//take input fro the user
System.out.println("Enter first number: ");
int number1 = sc.nextInt();

System.out.println("Enter second number: ");
int number2 = sc.nextInt();

//calculate remainder and quotient
int quotient = number1 / number2;
int remainder = number1 % number2;

//display the result
System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + number1 + " and " + number2);
}
}