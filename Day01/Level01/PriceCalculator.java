import java.util.Scanner;
public class PriceCalculator {
public static void main(String[] args) {

//create scanner object to take user input
Scanner sc = new Scanner(System.in);

//take the user input
System.out.println("Enter the unit price of an item: ");
double unitPrice = sc.nextDouble();

System.out.println("Enter the quantity of item: ");
int quantity = sc.nextInt();

//calculate the totalPrice
double totalPrice = unitPrice * quantity;

//display the result
System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
}
}