import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for age and height
        int amarAge, akbarAge, anthonyAge;
        double amarHeight, akbarHeight, anthonyHeight;

        // Input age and height for Amar
        System.out.print("Enter Amar's age: ");
        amarAge = scanner.nextInt();
        System.out.print("Enter Amar's height (in meters): ");
        amarHeight = scanner.nextDouble();

        // Input age and height for Akbar
        System.out.print("Enter Akbar's age: ");
        akbarAge = scanner.nextInt();
        System.out.print("Enter Akbar's height (in meters): ");
        akbarHeight = scanner.nextDouble();

        // Input age and height for Anthony
        System.out.print("Enter Anthony's age: ");
        anthonyAge = scanner.nextInt();
        System.out.print("Enter Anthony's height (in meters): ");
        anthonyHeight = scanner.nextDouble();

        // Find the youngest friend based on age
        int youngestAge = Math.min(Math.min(amarAge, akbarAge), anthonyAge);
        String youngestFriend = "";

        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find the tallest friend based on height
        double tallestHeight = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);
        String tallestFriend = "";

        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Display the results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
    }
}