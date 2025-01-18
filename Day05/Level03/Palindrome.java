import java.util.Scanner;

public class Palindrome {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String text) {
        int start = 0;  
        int end = text.length() - 1;  

      
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;  
            }
            start++;  
            end--;    
        }

        return true;  
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the text
        System.out.print("Enter a text to check if it is a palindrome: ");
        String input = sc.nextLine();

        // Check if the text is a palindrome
        boolean result = isPalindrome(input);

        // Display the result
        if (result) {
            System.out.println("The text \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + input + "\" is not a palindrome.");
        }

        sc.close();
    }
}
