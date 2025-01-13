import java.util.Scanner;
public class SideOfSquare {
public static void main(String[] args) {

//create scanner object to take user input
Scanner sc = new Scanner(System.in);

System.out.println("Enter the perimeter of the square: ");
double perimeter = sc.nextDouble();

//calculate the side of square
double side = perimeter / 4;

//display the result
System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

}
}

