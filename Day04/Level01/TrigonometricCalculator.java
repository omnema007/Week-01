import java.util.Scanner;

public class TrigonometricCalculator {

public static void calculateTrigonometricFunctions(double angle) {
// Convert angle to radians
double radians = Math.toRadians(angle);

// Calculate the trigonometric functions
double sine = Math.sin(radians);
double cosine = Math.cos(radians);
double tangent = Math.tan(radians);

System.out.println("Sine of " + angle + ": " + sine);
System.out.println("Cosine of " + angle + ": " + cosine);
System.out.println("Tangent of " + angle + ": " + tangent);
        
}

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

// Get the angle from the user
System.out.println("Enter the angle in degrees: ");
double angle = sc.nextDouble();

calculateTrigonometricFunctions(angle);

 sc.close();
}
}