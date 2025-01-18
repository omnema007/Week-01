import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String text) {
        String reverseStr = "";
        for (int i = text.length()-1; i >= 0; i--) {
            char ch = text.charAt(i);
            reverseStr += ch;
        }

        return reverseStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String text = sc.nextLine();

        System.out.println("Original string: " + text);
        System.out.println("Reverse string: " + reverseString(text));

    }
}
