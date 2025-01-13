import java.util.Scanner;
public class TravelDistance {
public static void main(String[] args) {

//create scanner object to take user input
Scanner sc = new Scanner(System.in);

// Create a variable name to indicate the person traveling
System.out.println("Enter the name of person: ");
String name = sc.next();

//create variable for from city, via city, to city
System.out.println("Enter the from city: ");
String fromCity = sc.next();

System.out.println("Enter the via city: ");
String viaCity = sc.next();

System.out.println("Enter the final city: ");
String toCity = sc.next();

//create variable for taking distance
System.out.println("Enter distance from city to via city: ");
double distanceFromToVia = sc.nextDouble();

System.out.println("Enter distance via city to final city: ");
double distanceViaToFinalCity = sc.nextDouble();


//create variable for taking time
System.out.println("Enter time taken from city to via city: ");
int timeFromToVia = sc.nextInt();

System.out.println("Enter time taken via city to final city: ");
int timeViaToFinalCity = sc.nextInt();

//calculate total distance
double totalDistance = distanceFromToVia + distanceViaToFinalCity;

//calculate total time
int totalTime = timeFromToVia + timeViaToFinalCity;

System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " 
+ totalDistance + " km and " +"the Total Time taken is " + totalTime + " minutes");
}
}

