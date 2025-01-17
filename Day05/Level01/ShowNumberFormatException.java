import java.util.Scanner;

public class ShowNumberFormatException {

//Method to generate NumberFormatException
public static void generateException(String str) {

System.out.println("Parsed Integer: " + Integer.parseInt(str));
}

//Method to handle NumberFormatException
public static void handleNumberFormatException(String str) {
try {
System.out.println("Parsed Integer: " + Integer.parseInt(str));
} catch (NumberFormatException e) {
System.out.println("caught a NumberFormatException: " + e.getMessage());
} catch (RuntimeException e) {
System.out.println("caught a RuntimeException: " + e.getMessage());
}
}

public static void main(String[] args) {

//Create scanner object for user input
Scanner sc = new Scanner(System.in);

//Taking user input
System.out.println("Enter a string: ");
String text = sc.next();

System.out.println("Demonstrating NumberFormatException: ");
try {
generateException(text);
} catch (NumberFormatException e) {
System.out.println("Caught NumberFormatException in main " + e.getMessage()); 
}

System.out.println("Handling NumberFormatException: ");
handleNumberFormatException(text);


}
}