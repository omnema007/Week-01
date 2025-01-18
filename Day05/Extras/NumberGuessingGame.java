import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100, and I'll try to guess it!");
        System.out.println("Provide feedback as follows:");
        System.out.println("- Enter 'h' if my guess is too high.");
        System.out.println("- Enter 'l' if my guess is too low.");
        System.out.println("- Enter 'c' if my guess is correct.");

        playGame();
    }

    // Main game logic
    public static void playGame() {
        int lowerBound = 1;
        int upperBound = 100;
        boolean correctGuess = false;

        Scanner scanner = new Scanner(System.in);

        while (!correctGuess) {
            int guess = generateGuess(lowerBound, upperBound);
            System.out.println("My guess is: " + guess);

            System.out.print("Is it (h)igh, (l)ow, or (c)orrect? ");
            String feedback = scanner.nextLine().trim().toLowerCase();

            if (feedback.equals("h")) {
                upperBound = guess - 1;
            } else if (feedback.equals("l")) {
                lowerBound = guess + 1;
            } else if (feedback.equals("c")) {
                System.out.println("Hooray! I guessed your number: " + guess);
                correctGuess = true;
            } else {
                System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
            }

            if (lowerBound > upperBound) {
                System.out.println("Hmm, something seems off. Are you sure about your feedback?");
                break;
            }
        }

        scanner.close();
    }

    // Function to generate a random guess within the bounds
    public static int generateGuess(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}
