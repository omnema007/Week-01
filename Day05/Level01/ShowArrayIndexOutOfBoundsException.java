import java.util.Scanner;

public class ShowArrayIndexOutOfBoundsException {
	
//Method to generate ArrayOutOfBoundsException
public static void generateException(String[] array) {

System.out.println("Accessing element at index 10: " + array[10]);

}

//Method to handle ArrayOutOfBoundsException
public static void handleArrayIndexOutOfBoundsException(String[] array) {
try {
System.out.println("Accessing element at index 10: " + array[10]);
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
} catch (RuntimeException e) {
System.out.println("caught a RuntimeException: " + e.getMessage());
}
}

public static void main(String[] args) {

//Create scanner object for user input
Scanner sc = new Scanner(System.in);

//Taking user input
System.out.println("Enter the number of names: ");
int n = sc.nextInt();

String[] array = new String[n];
System.out.println("Enter " + n + " names: ");
for (int i = 0; i < n; i++) {
array[i] = sc.next();
}

System.out.println("Demonstrating ArrayIndexOutOfBoundsException: ");
try {
generateException(array);
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Caught ArrayIndexOutOfBoundsException in main: " + e.getMessage());
}

System.out.println("Handling ArrayIndexOutOfBoundsException: ");
handleArrayIndexOutOfBoundsException(array);

sc.close();
}
}