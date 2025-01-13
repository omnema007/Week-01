import java.util.Scanner;

public class GeometryCalculator {

// Method to find the Euclidean distance between two points
public static double calculateDistance(double x1, double y1, double x2, double y2) {
return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
}

// Method to find the equation of the line given two points
public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
double[] lineEquation = new double[2]; 

if (x2 == x1) {

return null;
}


double slope = (y2 - y1) / (x2 - x1);

double yIntercept = y1 - slope * x1;

lineEquation[0] = slope;
lineEquation[1] = yIntercept;
return lineEquation;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


System.out.print("Enter x1, y1: ");
double x1 = sc.nextDouble();
double y1 = sc.nextDouble();

System.out.print("Enter x2, y2: ");
double x2 = sc.nextDouble();
double y2 = sc.nextDouble();

// Calculate and display the Euclidean distance
double distance = calculateDistance(x1, y1, x2, y2);
System.out.printf("Euclidean Distance between the points: %.2f%n", distance);

// Calculate and display the equation of the line
double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
if (lineEquation == null) {
System.out.println("The points form a vertical line. Slope is undefined.");
} else {
System.out.printf("Equation of the line: y = %.2fx + %.2f%n", lineEquation[0], lineEquation[1]);
}
}
}
