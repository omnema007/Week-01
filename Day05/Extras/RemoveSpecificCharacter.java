import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static String removeSpecificCharacter(String text, char ch) {
        String str = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ch) {
                str += text.charAt(i);
            }
        }

        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String text = sc.nextLine();
        System.out.println("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        System.out.println("Modified string: " + removeSpecificCharacter(text, ch));
    }
}
