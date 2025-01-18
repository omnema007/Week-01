import java.util.Scanner;

public class LengthFinder {

//Method to calculate length of string without using length()
public static int findLength(String text) {
int count = 0;

for (int i = 0; ; i++) {

try {
text.charAt(i);
count++;
} catch(Exception e) {
break;
}
}

return count;
}
public static void main(String[] args) {

//create scanner object for user input
Scanner sc = new Scanner(System.in);

//Taking user input
System.out.println("Enter the string: ");
String text = sc.nextLine();

//Call the method to calculate length of string
int lengthUsingUserMethod = findLength(text);

//Use built-in method to calculate string length
int lengthUsingBuiltInMethod = text.length();

//Display the result
System.out.println("Length using user defined method: " + lengthUsingUserMethod);
System.out.println("Length using built in method: " + lengthUsingBuiltInMethod);

}
}