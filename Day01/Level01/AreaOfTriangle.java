import java.util.Scanner;
public class AreaOfTriangle {
public static void main(String[] args) {

//create scanner object to take user input
Scanner sc = new Scanner(System.in);

System.out.println("Enter the base of a triangle in inches: ");
double base = sc.nextDouble();

System.out.println("Enter the height of a triangle in inches: ");
double height = sc.nextDouble();

//calculate area in square inches
double areaInches = 0.5 * base * height;

//convert the area to square centimeters
double areaCm = areaInches * 2.54 * 2.54;

//display the result
System.out.println("The area of the triangle in square inches is " + areaInches + " and in square centimeters is " + areaCm);
}
}

