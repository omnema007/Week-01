import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in the string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];  

        // Loop to find the frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;  
        }

       
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;  
            }
        }

        // Create the 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);  
                result[index][1] = String.valueOf(frequency[i]);  
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
        String[][] result = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character frequencies in the string:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Character: " + result[i][0] + ", Frequency: " + result[i][1]);
        }

        sc.close();
    }
}
