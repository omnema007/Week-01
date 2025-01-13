import java.util.Scanner;
public class FarenheitToCelsius{
public static void main(String[] args) {

//create scanner object to take user input
Scanner sc = new Scanner(System.in);

//take input from the user
System.out.println("Enter temperature in fahrenheit: ");
double fahrenheit = sc.nextDouble();

//convert celsius to fahrenheit
double celsiusResult = (fahrenheit - 32) * 5/9;

//display the result
System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");

sc.close();
}
}

