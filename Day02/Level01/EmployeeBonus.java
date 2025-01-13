import java.util.Scanner;

public class EmployeeBonus {
public static void main(String[] args) {
// Create a scanner object to take input from the user
Scanner sc = new Scanner(System.in);

// Take salary and year of service as input
System.out.print("Enter the employee's salary: ");
double salary = sc.nextDouble();

System.out.print("Enter the employee's years of service: ");
int yearsOfService = sc.nextInt();

// Check if the employee is eligible for a bonus
if (yearsOfService > 5) {
// Calculate the bonus (5% of salary)
double bonus = salary * 0.05;

// Print the bonus amount
System.out.println("The bonus amount is: " + bonus);
} else {
System.out.println("The employee is not eligible for a bonus.");
}

 sc.close();
}
}