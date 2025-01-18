import java.util.Scanner;

public class Anagram {
public static boolean areAnagram(String str1, String str2) {
if (str1.length() != str2.length()) {
return false;
}

int[] arr1 = new int[256];
int[] arr2 = new int[256];

for (int i = 0; i < str1.length(); i++) {
char ch = str1.charAt(i);
arr1[ch]++;
}

for (int i = 0; i < str2.length(); i++) {
char ch = str2.charAt(i);
arr2[ch]++;
}

for (int i = 0; i < 256; i++) {
if (arr1[i] != arr2[i]) {
return false;
}
}

return true;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter first string: ");
String text1 = sc.nextLine();

System.out.println("Enter second string: ");
String text2 = sc.nextLine();

if (areAnagram(text1, text2)) {
System.out.println("Both strings are Anagram");
} else {
System.out.println("Both strings are not Anagram");
}

}
}