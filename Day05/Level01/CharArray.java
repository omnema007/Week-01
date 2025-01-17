import java.util.Scanner;

public class CharArray {

// Method to return characters of a string as an array (without toCharArray())
public static char[] getCharsFromString(String text) {
char[] characters = new char[text.length()];
for (int i = 0; i < text.length(); i++) {
characters[i] = text.charAt(i);
}
return characters;
}

// Method to compare two character arrays
public static boolean compareCharArrays(char[] array1, char[] array2) {
if (array1.length != array2.length) {
return false;
}
for (int i = 0; i < array1.length; i++) {
if (array1[i] != array2[i]) {
return false;
}
}
return true;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Taking input from the user
System.out.print("Enter the string: ");
String text = sc.next();


char[] userDefinedChars = getCharsFromString(text);


char[] builtInChars = text.toCharArray();


boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

// Displaying the results
System.out.println("\nCharacters using user-defined method:");
for (char c : userDefinedChars) {
System.out.print(c + " ");
}

System.out.println("\nCharacters using built-in toCharArray() method:");
for (char c : builtInChars) {
System.out.print(c + " ");
}

System.out.println("\n\nAre the two arrays equal? " + areEqual);

sc.close();
}
}
