public class NullPointerExceptionShow {

//Method to generate NullPointerException
public static void nullPointerException() {
String text = null;

System.out.println("Length of string: " + text.length());
}

//Method to handle NullPointerException
public static void handleNullPointerException() {
String text = null;

try {
System.out.println("Length of string: " + text.length());
} catch (NullPointerException e) {
System.out.println("caught a NullPointerException: " + e.getMessage());
}
}
public static void main(String[] args) {
	
System.out.println("Demonstrating NullPointerException: ");
try {
nullPointerException();
} catch (NullPointerException e) {
System.out.println("Caught NullPointerException in main: " + e.getMessage());
}

System.out.println("Handling NullPointerException:");
handleNullPointerException();
}
}