import java.util.Scanner;

public class CharacterFrequencyWithUnique {

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        // Nested loop to find unique characters
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

         
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

       
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

  
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Method to find the frequency of characters using unique characters
    public static String[][] findCharacterFrequency(String text) {
        char[] uniqueChars = findUniqueCharacters(text); 
        int[] frequency = new int[uniqueChars.length]; 

        // Count the frequency of each unique character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Increment the count for the corresponding unique character
            for (int j = 0; j < uniqueChars.length; j++) {
                if (uniqueChars[j] == currentChar) {
                    frequency[j]++;
                    break;
                }
            }
        }

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Store character
            result[i][1] = String.valueOf(frequency[i]);   // Store frequency
        }

        return result;
    }

    // Main method to take input and display the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find the character frequencies
        String[][] result = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character frequencies in the string:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Character: " + result[i][0] + ", Frequency: " + result[i][1]);
        }

        sc.close();
    }
}
