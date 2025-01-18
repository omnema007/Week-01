import java.util.Scanner;

public class FrequentCharacter {
    public static char findMostFrequentCharacter(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        int maxCount = 0;
        char ch = '\0';
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                 ch = (char)(i);
            }
        }

        return ch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String text = sc.nextLine();

        System.out.println("Most Frequent Character: " + findMostFrequentCharacter(text));
    }
}
