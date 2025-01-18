import java.util.Scanner;

public class LongestWord {
    public static String findLongestWord(String str) {
        String text = "";
        String[] arr = str.split(" ");
        int maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
        String word = arr[i];
        int length = word.length();
        if (length > maxLength) {
        maxLength = length;
        text = word;
}
}

return text;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("The longest word is: " + findLongestWord(str));
    }
}
