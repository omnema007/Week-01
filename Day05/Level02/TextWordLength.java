import java.util.Scanner;

public class TextWordLength {

    // Method to split text into words without StringBuilder
    public static String[] splitIntoWords(String text) {
        String[] tempWords = new String[100]; // Temporary array to store words
        int wordCount = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ' || i == text.length() - 1) {
                if (i == text.length() - 1 && ch != ' ') {
                    word += ch; // Add the last character
                }
                if (!word.isEmpty()) {
                    tempWords[wordCount] = word;
                    wordCount++;
                    word = "";
                }
            } else {
                word += ch;
            }
        }

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = tempWords[i];
        }
        return words;
    }

    // Method to calculate string length without using length() method
    public static int getStringLength(String text) {
        int count = 0;
        for (char ch : text.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }

        return result;
    }

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordLengthArray) {
        String shortest = wordLengthArray[0][0];
        String longest = wordLengthArray[0][0];

        for (String[] row : wordLengthArray) {
            if (getStringLength(row[0]) < getStringLength(shortest)) {
                shortest = row[0];
            }
            if (getStringLength(row[0]) > getStringLength(longest)) {
                longest = row[0];
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a line of text:");
        String text = sc.nextLine();

        // Split text into words
        String[] words = splitIntoWords(text);

        //2D array of words and their lengths
        String[][] wordLengthArray = getWordsWithLengths(words);

        // Display words and their lengths
        System.out.println("\nWord\t\tLength");
        for (String[] row : wordLengthArray) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }

        // Find shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordLengthArray);
        System.out.println("\nShortest Word: " + shortestAndLongest[0]);
        System.out.println("Longest Word: " + shortestAndLongest[1]);

        sc.close();
    }
}
