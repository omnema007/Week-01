import java.util.Scanner;

public class Anagram {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
       
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store the frequency of characters for each text
        int[] frequency1 = new int[256]; // For text1
        int[] frequency2 = new int[256]; // For text2

     
        for (int i = 0; i < text1.length(); i++) {
            char ch1 = text1.charAt(i);
            frequency1[ch1]++;
        }

       
        for (int i = 0; i < text2.length(); i++) {
            char ch2 = text2.charAt(i);
            frequency2[ch2]++;
        }

        // Compare the frequencies of characters in the two texts
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true; 
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the two texts
        System.out.print("Enter the first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = sc.nextLine();

        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts \"" + text1 + "\" and \"" + text2 + "\" are anagrams.");
        } else {
            System.out.println("The texts \"" + text1 + "\" and \"" + text2 + "\" are not anagrams.");
        }

        sc.close();
    }
}
