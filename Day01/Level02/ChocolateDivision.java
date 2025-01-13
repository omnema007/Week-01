import java.util.Scanner;
public class ChocolateDivision {
public static void main(String[] args) {

//create scanner object for user input
Scanner sc = new Scanner(System.in);

//Input the number of chocolates
System.out.print("Enter the number of chocolates: ");
int numberOfChocolates = sc.nextInt();

// Input the number of children
System.out.print("Enter the number of children: ");
int numberOfChildren = sc.nextInt();

//calculate chocolates each child gets and remaining chocolates
int chocolatesPerChild = numberOfChocolates / numberOfChildren;
int remainingChocolates = numberOfChocolates % numberOfChildren;

// Output the results
System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);

sc.close();
}
}