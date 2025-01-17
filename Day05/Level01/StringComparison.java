import java.util.Scanner;

public class StringComparison {

//Method to compare strings
public static boolean isEquals(String str1, String str2) {

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

//create scanner object for user input
Scanner sc = new Scanner(System.in);

//take user input
System.out.print("Enter first string: ");
String str1 = sc.next();

System.out.print("Enter second string: ");
String str2 = sc.next();

boolean charAtResult = isEquals(str1, str2);

boolean equalsResult = str1.equals(str2);

// Display the results
System.out.println("Comparison using charAt(): " + charAtResult);
System.out.println("Comparison using equals(): " + equalsResult);

if (charAtResult == equalsResult) {
System.out.println("Both methods give the same result.");
} else {
System.out.println("The results of the two methods differ.");
}

sc.close();
}
}