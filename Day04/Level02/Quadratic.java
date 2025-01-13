import java.util.Scanner;

public class Quadratic {

// Method to find the roots of a quadratic equation
public double[] findRoots(double a, double b, double c) {
double delta = Math.pow(b, 2) - 4 * a * c; 

if (delta > 0) {

double root1 = (-b + Math.sqrt(delta)) / (2 * a);
double root2 = (-b - Math.sqrt(delta)) / (2 * a);
return new double[] { root1, root2 };
} else if (delta == 0) {
double root = -b / (2 * a);
return new double[] { root };
} else {
return new double[] {}; 
}
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter number a: ");
double a = sc.nextDouble();

System.out.print("Enter number b: ");
double b = sc.nextDouble();

System.out.print("Enter number c: ");
double c = sc.nextDouble();

Quadratic quadratic = new Quadratic();

// Find the roots
double[] roots = quadratic.findRoots(a, b, c);
// Display the results
if (roots.length == 2) {
System.out.println("The equation has two roots: ");
System.out.printf("Root 1: %.2f%n", roots[0]);
System.out.printf("Root 2: %.2f%n", roots[1]);
} else if (roots.length == 1) {
System.out.println("The equation has one root: ");
System.out.printf("Root: %.2f%n", roots[0]);
} else {
System.out.println("The equation has no real roots.");
}

sc.close();
}
}
