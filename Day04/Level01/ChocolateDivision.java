import java.util.Scanner;

public class ChocolateDivision {

// Method to find the quotient and remainder
public static void findRemainderAndQuotient(int number, int divisor) {

int quotient = number / divisor; 
int remainder = number % divisor; 

System.out.println("Each child will get " + quotient + " chocolates.");
System.out.println("Remaining chocolates: " + remainder);
 
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter the total number of chocolates: ");
int numberOfChocolates = sc.nextInt();

System.out.println("Enter the number of children: ");
int numberOfChildren = sc.nextInt();

if (numberOfChildren <= 0) {
System.out.println("The number of children must be greater than zero.");
} else {
findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

}

sc.close();
}
}
