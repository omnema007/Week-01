import java.util.Scanner;
public class DistanceCalculator {
public static void main(String[] args) {

//create scanner object to take user input
Scanner sc = new Scanner(System.in);

System.out.println("Enter distance in feet: ");
double distance = sc.nextDouble();

//calculate distance in yards and miles
double distanceInYards = distance / 3;
double distanceInMiles = distanceInYards / 1760;

//display the result
System.out.println("The distance in yards is " + distanceInYards + " and the distance in miles is " + distanceInMiles);

sc.close();
}
}

