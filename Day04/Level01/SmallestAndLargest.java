import java.util.Scanner;

public class SmallestAndLargest {

// Method to find the smallest and largest of three numbers
public static void findSmallestAndLargest(int number1, int number2, int number3) {

int smallest = Math.min(number1, Math.min(number2, number3)); 
int largest = Math.max(number1, Math.max(number2, number3)); 

System.out.println("The smallest number is: " + smallest);
System.out.println("The largest number is: " + largest);

}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Get input from the user
System.out.println("Enter the first number: ");
int number1 = sc.nextInt();

System.out.println("Enter the second number: ");
int number2 = sc.nextInt();

System.out.println("Enter the third number: ");
int number3 = sc.nextInt();

// Display the result
findSmallestAndLargest(number1, number2, number3);


sc.close();
}
}
