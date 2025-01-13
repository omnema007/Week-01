import java.util.Scanner;

public class MultiplicationTable {
public static void main(String[] args) {
// Create a scanner object to take input from the user
Scanner sc = new Scanner(System.in);

// Take an integer input for the number
System.out.print("Enter a number: ");
int number = sc.nextInt();

// Using a for loop to generate multiplication tables from 6 to 9
for (int i = 6; i <= 9; i++) {
// Print the multiplication table in the format: number * i = result
System.out.println(number + " * " + i + " = " + (number * i));
}

sc.close();
}
}