import java.util.Scanner;

public class TextSplitter {
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

// Method to split text into words without using split()
public static String[] customSplit(String text) {
int length = findLength(text);
int wordCount = 1;

// Count words based on spaces
for (int i = 0; i < length; i++) {
if (text.charAt(i) == ' ') {
wordCount++;
}
}

// Array to store words
String[] words = new String[wordCount];
int start = 0, wordIndex = 0;

for (int i = 0; i < length; i++) {
if (text.charAt(i) == ' ' || i == length - 1) {
// Handle last word
int end = (i == length - 1) ? i + 1 : i;
words[wordIndex] = text.substring(start, end);
wordIndex++;
start = i + 1;
}
}
return words;
}

// Method to compare two String arrays
public static boolean compareArrays(String[] array1, String[] array2) {
if (array1.length != array2.length) {
return false;
}
for (int i = 0; i < array1.length; i++) {
if (!array1[i].equals(array2[i])) {
return false;
}
}
return true;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Take user input
System.out.println("Enter a sentence:");
String input = sc.nextLine();

// Custom split method
String[] customSplitResult = customSplit(input);

// Built-in split method
String[] builtInSplitResult = input.split(" ");

// Compare the two results
boolean areEqual = compareArrays(customSplitResult, builtInSplitResult);

// Display results
System.out.println("Custom Split Result:");
for (String word : customSplitResult) {
System.out.println(word);
}

System.out.println("\nBuilt-in Split Result:");
for (String word : builtInSplitResult) {
System.out.println(word);
}

System.out.println("\nAre the results equal? " + areEqual);

sc.close();
}
}