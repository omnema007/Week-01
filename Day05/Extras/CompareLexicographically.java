import java.util.Scanner;

public class CompareLexicographically {
    public static int compareStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();

        int minLength = Math.min(length1, length2);
        
         str1 = str1.toLowerCase();
         str2 = str2.toLowerCase();

         for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (str1.charAt(i) > str2.charAt(i)) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
         }

         return 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        int result = compareStrings(str1, str2);
        if (result == 1) {
            System.out.println(str1 + " comes before " + str2 + " in lexicographically order");
        }
        else if (result == -1){
            System.out.println(str2 + " comes before " + str1 + " in lexicographically order");
        }
        else {
            System.out.println("Both are equal");
        }

    }
}
