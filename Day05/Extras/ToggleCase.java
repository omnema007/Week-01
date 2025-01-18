import java.util.Scanner;

public class ToggleCase {
    public static String convertToggleCase(String text) {
        String str = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            else {
                ch = (char)(ch - 32);
            }

            str += ch;
        }

        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String text = sc.nextLine();

        System.out.println("Before toggle string is: " + text);
        System.out.println("After toggle string is: " + convertToggleCase(text));
    }
}
