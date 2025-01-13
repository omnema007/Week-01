import java.util.Scanner;

public class UnitConverter2 {

// Method to convert yards to feet
public static double convertYardsToFeet(double yards) {
double yards2feet = 3; 
return yards * yards2feet;
}

// Method to convert feet to yards
public static double convertFeetToYards(double feet) {
double feet2yards = 0.333333; // 1 foot = 0.333333 yards
return feet * feet2yards;
}

// Method to convert meters to inches
public static double convertMetersToInches(double meters) {
double meters2inches = 39.3701; // 1 meter = 39.3701 inches
return meters * meters2inches;
}

// Method to convert inches to meters
public static double convertInchesToMeters(double inches) {
double inches2meters = 0.0254; // 1 inch = 0.0254 meters
return inches * inches2meters;
}

// Method to convert inches to centimeters
public static double convertInchesToCentimeters(double inches) {
double inches2cm = 2.54; // 1 inch = 2.54 centimeters
return inches * inches2cm;
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter the value in yards: ");
double yards = sc.nextDouble();
System.out.print("Enter the value in feet: "); 
double feet = sc.nextDouble(); 
System.out.print("Enter the value in meters: ");
double meters = sc.nextDouble(); 
System.out.print("Enter the value in inches: ");
double inches = sc.nextDouble(); 

System.out.println(yards + " yards is equal to " + convertYardsToFeet(yards) + " feet.");
System.out.println(feet + " feet is equal to " + convertFeetToYards(feet) + " yards.");
System.out.println(meters + " meters is equal to " + convertMetersToInches(meters) + " inches.");
System.out.println(inches + " inches is equal to " + convertInchesToMeters(inches) + " meters.");
System.out.println(inches + " inches is equal to " + convertInchesToCentimeters(inches) + " centimeters.");
}
}