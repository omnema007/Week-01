import java.util.Scanner;

public class CountSubstring {
    public static int findSubstringCount(String str, String subStr) {
        int count = 0;
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            if(word.equals(subStr)) {
                count++;
            }
            
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String text = sc.nextLine();
        System.out.println("Enter the substring: ");
        String subStr = sc.nextLine();

        System.out.println("The number of given substring occur is: " + findSubstringCount(text, subStr));
    }
}
