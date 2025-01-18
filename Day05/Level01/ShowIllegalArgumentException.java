import java.util.Scanner;

public class ShowIllegalArgumentException {
	
//Method to generate IllegalArgumentException	
public static void generateException(String str) {

System.out.println("Substring " + str.substring(7, 3));

}

//Method to handle IllegalArgumentException
public static void handleIllegalArgumentException(String str) {
try {
System.out.println("Substring " + str.substring(7, 3));
} catch (IllegalArgumentException e) {
System.out.println("caught a IllegalArgumentException " + e.getMessage());
} catch (RuntimeException e) {
System.out.println("caught a RuntimeException " + e.getMessage());
}
}

public static void main(String[] args) {

//Create scanner object for user input
Scanner sc = new Scanner(System.in);

//Taking user input
System.out.println("Enter a string: ");
String text = sc.next();

System.out.println("Demonstrating IllegalArgumentException: ");
try {
generateException(text);
} catch (IllegalArgumentException e ) {
System.out.println("Caught a IllegalArgumentException in main " + e.getMessage());
} 

System.out.println("Handling IllegalArgumentException:");
handleIllegalArgumentException(text);
}
}