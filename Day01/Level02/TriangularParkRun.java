import java.util.*;
public class TriangularParkRun {
public static void main(String[] args) {

//create scanner object for user input
Scanner sc = new Scanner(System.in);

//Input the sides of triangular park
System.out.println("Enter the first side of the triangular park in meters: ");
double side1 = sc.nextDouble();

System.out.println("Enter the second side of the triangular park in meters: ");
double side2 = sc.nextDouble();

System.out.println("Enter the third side of the triangular park in meters: ");
double side3 = sc.nextDouble();

//calculate the perimeter of triangle
double perimeter = side1 + side2 + side3;

double totalDistance = 5000; //convert 5 km into meters

//calculate total numbers of round
double rounds = totalDistance / perimeter;

//display the result
System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km");

sc.close();
}
}