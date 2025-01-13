import java.util.Scanner;

public class AthleteRun {

// Method to calculate the perimeter of the triangle
public static double calculatePerimeter(double side1, double side2, double side3) {
return side1 + side2 + side3;
}

// Method to calculate the number of rounds needed to complete a 5km run
public static int calculateRounds(double perimeter, double distance) {
return (int) Math.ceil(distance / perimeter);
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Taking input for the sides of the triangle
System.out.println("Enter the length of the first side of the triangle (in meters): ");
double side1 = sc.nextDouble();

System.out.println("Enter the length of the second side of the triangle (in meters): ");
double side2 = sc.nextDouble();

System.out.println("Enter the length of the third side of the triangle (in meters): ");
double side3 = sc.nextDouble();

// Calculate the perimeter of the triangle
double perimeter = calculatePerimeter(side1, side2, side3);

// Convert 5 kilometers to meters
double distance = 5000; 

// Calculate the number of rounds
int rounds = calculateRounds(perimeter, distance);

// Display the result
System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 kilometers.");

sc.close();
}
}
