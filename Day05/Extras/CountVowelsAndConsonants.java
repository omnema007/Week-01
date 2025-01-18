import java.util.Scanner;

public class CountVowelsAndConsonants {

    public static String checkVowelAndConsonant(char ch) {
        //convert to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }

        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }

        return "Not a Letter";
    }

    public static int[] countVowelsAndConsonats(String text) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String results = checkVowelAndConsonant(ch);

            if (results.equals("Vowel")) {
                vowelCount++;
            } else if (results.equals("Consonant")) {
                consonantCount++;

            }
        }

        return new int[]{vowelCount, consonantCount};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String text = sc.nextLine();

        int[] arr = countVowelsAndConsonats(text);

        System.out.println("Number of Vowels: " + arr[0]);
        System.out.println("Number of Consonants: " + arr[1]);

    }
}
