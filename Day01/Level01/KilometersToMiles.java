import java.util.Scanner;
public class KilometersToMiles {
public static void main(String[] args) {

//create variable km
double km;

//create scanner object to take user input
Scanner sc = new Scanner(System.in);

System.out.println("Enter distance in kilometers: ");
km = sc.nextDouble();

//calculate conversion of km to miles
double miles = km / 1.6;

//display the result
System.out.println("The total miles is " + miles + " for the given km " + km + " km");


sc.close();
}
}

