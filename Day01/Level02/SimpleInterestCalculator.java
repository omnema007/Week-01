import java.util.Scanner;
public class SimpleInterestCalculator {
public static void main(String[] args) {

//create scanner object for user input
Scanner sc = new Scanner(System.in);

//Input the Principal amount
System.out.print("Enter the Principal amount: ");
double principal = sc.nextDouble();

//Input the Rate of Interest
System.out.print("Enter the Rate of Interest (in %): ");
double rate = sc.nextDouble();

//Input the Time (in years)
System.out.print("Enter the Time (in years): ");
double time = sc.nextDouble();

//Calculate Simple Interest
double simpleInterest = (principal * rate * time) / 100;

 //display the result
System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + "%, and Time " + time + " years.");

sc.close();
}
