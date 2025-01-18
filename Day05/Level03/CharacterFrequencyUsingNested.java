import java.util.Scanner;

public class CharacterFrequencyUsingNested {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray(); // Convert the string to a character array
        int[] frequency = new int[characters.length]; 

        // Outer loop to iterate through each character
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') { 
                frequency[i] = 1; 

                // Inner loop to check for duplicate characters
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++; // Increment frequency
                        characters[j] = '0'; 
                    }
                }
            }
        }

        // Create a 1D String array to store the characters and their frequencies
        int resultCount = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                resultCount++;
            }
        }

        String[] result = new String[resultCount];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index] = "Character: " + characters[i] + ", Frequency: " + frequency[i];
                index++;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find the character frequencies
        String[] result = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character frequencies in the string:");
        for (String entry : result) {
            System.out.println(entry);
        }

        sc.close();
    }
}
