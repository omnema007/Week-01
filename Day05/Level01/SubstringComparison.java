import java.util.Scanner;

public class SubstringComparison {
// Method to create a substring using charAt
public static String createSubstring(String text, int start, int end) {
String result = "";
for (int i = start; i < end; i++) {
result += text.charAt(i);
}
return result;
}

// Method to compare two strings using charAt
public static boolean compareStrings(String str1, String str2) {
if (str1.length() != str2.length()) {
return false;
}
for (int i = 0; i < str1.length(); i++) {
if (str1.charAt(i) != str2.charAt(i)) {
return false;
}
}
return true;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Taking input from the user
System.out.print("Enter the original string: ");
String text = sc.next();
        
System.out.print("Enter the start index: ");
int start = sc.nextInt();
        
System.out.print("Enter the end index: ");
int end = sc.nextInt();

// Creating substrings
String substringUsingCharAt = createSubstring(text, start, end);
String substringUsingBuiltIn = text.substring(start, end);

// Comparing the substrings
boolean areEqual = compareStrings(substringUsingCharAt, substringUsingBuiltIn);

// Displaying the results
System.out.println("\nSubstring using charAt(): " + substringUsingCharAt);
System.out.println("Substring using built-in method: " + substringUsingBuiltIn);
System.out.println("Are the two substrings equal? " + areEqual);

sc.close();
}
}
