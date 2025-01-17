import java.util.Scanner;

public class VowelsAndConsonants2 {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkVowelOrConsonant(char ch) {
        // Convert to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check for vowels
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }

        // Check for consonants
        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }

        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string and return the result in a 2D array
    public static String[][] findCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkVowelOrConsonant(ch);
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayCharacterTypes(String[][] charTypes) {
        System.out.println("\nCharacter\tType");
        System.out.println("--------------------");
        for (String[] row : charTypes) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Find character types
        String[][] charTypes = findCharacterTypes(text);

        // Display character types in tabular format
        displayCharacterTypes(charTypes);

        sc.close();
    }
}
