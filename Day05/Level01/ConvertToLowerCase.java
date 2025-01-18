import java.util.Scanner;

public class ConvertToLowerCase {

//Method to convert uppercase letter to lowercase letters
public static String upperCaseToLowerCase(String text) {
String str = "";

for (int i = 0; i < text.length(); i++) {
char ch = text.charAt(i);

if (ch >= 'A' && ch <= 'Z') {
str += (char)(ch + 32);
} else {
str += ch;
}
}

return str;
}

//Method to compare strings
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

//Create scanner object for user input
Scanner sc = new Scanner(System.in);

//Taking the user input
System.out.println("Enter the string: ");
String text = sc.nextLine();

//Call the method to convert letters uppercase to lowercase
String userDefinedLowercase = upperCaseToLowerCase(text);

//Use built-in function to convert letter from uppercase to lowercase
String builtinLowercase = text.toLowerCase();

boolean areEquals = compareStrings(userDefinedLowercase, builtinLowercase);

//Display the result
System.out.println("User Defined Lowercase: " + userDefinedLowercase);
System.out.println("Built-in Lowercase: " + builtinLowercase);
System.out.println("Are both strings equal?: " + areEquals);


}
}