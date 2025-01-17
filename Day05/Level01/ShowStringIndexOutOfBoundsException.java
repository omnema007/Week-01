import java.util.Scanner;

public class ShowStringIndexOutOfBoundsException {

//Method to generate StringIndexOutOfBoundsException
public static void generateException(String str) {

System.out.println("Character at index 50: " + str.charAt(50));
}

//Method to handle StringOutOfBoundsException
public static void handleStringIndexOutOfBoundsException(String str) {

try {
System.out.println("Character at index 50: " + str.charAt(50));
} catch (StringIndexOutOfBoundsException e) {
System.out.println("caught a StringIndexOutOfBoundsException: " + e.getMessage());
}
}

public static void main(String[] args) {
	
//Create scanner object to take user input
Scanner sc = new Scanner(System.in);

//Taking user input
System.out.println("Enter a string: ");
String text = sc.next();

System.out.println("Demonstrating StringIndexOutOfBoundsException: ");
try {
generateException(text);
} catch (StringIndexOutOfBoundsException e) {
System.out.println("Caught a StringIndexOutOfBoundsException in main " + e.getMessage());
}

System.out.println("Handling StringIndexOutOfBoundsException:");
handleStringIndexOutOfBoundsException(text);

}
}