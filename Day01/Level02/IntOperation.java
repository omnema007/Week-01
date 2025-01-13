import java.util.Scanner;
public class IntOperation {
public static void main(String[] args) {

//create scanner object to take user input
Scanner sc = new Scanner(System.in);

//input values for a, b, and class
System.out.println("Enter the value of a: ");
int a = sc.nextInt();

System.out.println("Enter the value of b: ");
int b = sc.nextInt();

System.out.println("Enter the value of c: ");
int c = sc.nextInt();

//perform integer operations
int result1 = a + b * c;
int result2 = a * b + c;
int result3 = c + a / b;
int result4 = a % b + c;

//display the result
System.out.println("The result of Int Operation are " + result1 + ", " + result2 + ", " + result3 + " and " + result4);

sc.close();

}
}

