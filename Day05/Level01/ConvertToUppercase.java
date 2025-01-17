import java.util.Scanner;

public class ConvertToUppercase {

//Method to convert lowercase to uppercase letter
public static String lowerCaseToUpperCase(String text) {
String str = "";

for (int i = 0; i < text.length(); i++) {
char ch = text.charAt(i);

if (ch >= 'a' && ch <= 'z') {
str += (char)(ch - 32);
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

//Taking user input
System.out.println("Enter the string: ");
String text = sc.nextLine();

//Call the method to convert letters lowercase to uppercase
String userDefinedUppercase = lowerCaseToUpperCase(text);

//Use built-in function to convert letter from lowercase to uppercase
String builtinUppercase = text.toUpperCase();

boolean areEquals = compareStrings(userDefinedUppercase, builtinUppercase);

//Display the result
System.out.println("User Defined Uppercase: " + userDefinedUppercase);
System.out.println("Built-in Uppercase: " + builtinUppercase);
System.out.println("Are both strings equal?: " + areEquals);

sc.close();
}
}