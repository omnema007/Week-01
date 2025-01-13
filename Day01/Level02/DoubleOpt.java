
import java.util.Scanner;
public class DoubleOpt {
public static void main(String[] args) {

//create scanner object to take user input
Scanner sc = new Scanner(System.in);

//input values for a, b, and class
System.out.println("Enter the value of a: ");
double a = sc.nextDouble();

System.out.println("Enter the value of b: ");
double b = sc.nextDouble();

System.out.println("Enter the value of c: ");
double c = sc.nextDouble();

//perform integer operations
double result1 = a + b * c;
double result2 = a * b + c;
double result3 = c + a / b;
double result4 = a % b + c;

//display the result
System.out.println("The result of Int Operation are " + result1 + ", " + result2 + ", " + result3 + " and " + result4);

sc.close();

}
}

