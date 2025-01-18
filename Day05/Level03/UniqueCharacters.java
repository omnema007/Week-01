import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the string without using String.length()
    public static int findLength(String text) {
        int length = 0;
        while (true) {
            try {
                text.charAt(length); 
                length++;
            } catch (IndexOutOfBoundsException e) {
                break; 
            }
        }
        return length;
    }

    // Method to find unique characters in the string using charAt() method
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);  
        char[] uniqueChars = new char[length]; 
        int uniqueCount = 0;  

        // Loop through the string using nested loops
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            
            // Check if the current character is unique
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break; 
                }
            }
            
            // If character is unique, store it in the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Manually create a new array with the exact size of unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i]; 
        }

        return result;
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input for the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find unique characters
        char[] uniqueCharacters = findUniqueCharacters(input);

        // Display the result
        System.out.print("Unique characters: ");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}
