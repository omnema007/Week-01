import java.util.Scanner;

public class QuotientAndRemainder {

// Method to find the remainder and quotient of a number
public static void findRemainderAndQuotient(int number, int divisor) {

int quotient = number / divisor; 
int remainder = number % divisor; 

System.out.println("The quotient is: " + quotient);
System.out.println("The remainder is: " + remainder);

}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

// Get input from the user
System.out.println("Enter the dividend (number): ");
int number = sc.nextInt();

System.out.println("Enter the divisor: ");
int divisor = sc.nextInt();

// Check if the divisor is not zero
if (divisor == 0) {
System.out.println("Division by zero is not allowed.");
} else {
findRemainderAndQuotient(number, divisor);

}

sc.close();
}
}