import java.util.Scanner;

public class TrimLeadingAndTrailingSpaces {

    // Method to trim leading and trailing spaces from a string using charAt()
    public static int[] trimSpaces(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
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

        // Take user input
        System.out.println("Enter a string with leading and trailing spaces:");
        String text = sc.nextLine();

        // Trim spaces using custom method
        int[] trimIndices = trimSpaces(text);
        String trimmedTextCustom = createSubstring(text, trimIndices[0], trimIndices[1]);

        // Trim spaces using built-in method
        String trimmedTextBuiltIn = text.trim();

        // Compare the results
        boolean isSame = compareStrings(trimmedTextCustom, trimmedTextBuiltIn);

        // Display results
        System.out.println("\nText after trimming (custom method): " + trimmedTextCustom);
        System.out.println("Text after trimming (built-in method): " + trimmedTextBuiltIn);
        System.out.println("Are both trimmed texts the same? " + isSame);

        sc.close();
    }
}
