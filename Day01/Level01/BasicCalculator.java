import java.util.Scanner;
public class BasicCalculator {
public static void main(String[] args) {

//create scanner object to take user input
Scanner sc = new Scanner (System.in);
System.out.println("Enter first number: ");
double number1 = sc.nextDouble();

System.out.println("Enter second number: ");
double number2 = sc.nextDouble();

//perform arithmetic operation 
double addition = number1 + number2;
double subtraction = number1 - number2;
double multiplication = number1 * number2;
double division = number1 / number2;

//display the result
System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", " + " and " + division);

sc.close();
}
}

