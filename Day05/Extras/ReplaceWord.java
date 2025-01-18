import java.util.Scanner;

public class ReplaceWord {
    public static String[] replace(String text, String word, String repWord) {
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                arr[i] = repWord;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String text = sc.nextLine();
        System.out.println("Enter the word to be replaced: ");
        String word = sc.next();
        System.out.println("Enter replacing word: ");
        String repWord = sc.next();

        System.out.println("String before replace word: " + text);

        String[] result = replace(text, word, repWord);
        System.out.println("String after replacing word: ");
        for (String st : result) {
            System.out.print(st + " ");
        }
    }
}
