import java.util.Scanner;
public class TemperatureConversion{
public static void main(String[] args) {

//create scanner object to take user input
Scanner sc = new Scanner(System.in);

//take input from the user
System.out.println("Enter temperature in celsius: ");
double celsius = sc.nextDouble();

//convert celsius to fahrenheit
double farenheitResult = (celsius * 9/5) + 32;

//display the result
System.out.println("The " + celsius + " celsius is " + fahrenheit Result + " fahrenheit");

sc.close();
}
}

