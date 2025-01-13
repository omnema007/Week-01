import java.util.Scanner;
public class TotalIncome {
public static void main(String[] args) {

//create scanner object to take user input
Scanner sc = new Scanner(System.in);

//input the salary
System.out.println("Enter the salary: ");
double salary = sc.nextDouble();

//input the bonus
System.out.println("Enter the bonus: ");
double bonus = sc.nextDouble();

//calculate total income
double totalIncome = salary + bonus;

//display the result
System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
}
}

