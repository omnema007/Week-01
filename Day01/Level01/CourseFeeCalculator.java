import java.util.Scanner;
public class CourseFeeCalculator {
public static void main(String[] args) {

//create scanner object to take user input
Scanner sc = new Scanner(System.in);

System.out.println("Enter the student fee: ");
double fee = sc.nextDouble();

System.out.println("Enter the discount percentage: ");
double discountPercent = sc.nextDouble();

//calculate discount fee
double discount = fee * discountPercent / 100.0;

//calculate final fee 
double finalFee = fee - discount;

//display the result
System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

sc.close();
}
}

