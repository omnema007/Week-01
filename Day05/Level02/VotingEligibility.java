import java.util.Scanner;

public class VotingEligibility {

    // Method to generate a random age for students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90) + 10; // Generates a random age between 10 and 99
        }
        return ages;
    }

    // Method to check whether a student can vote based on age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
            result[i][0] = String.valueOf(ages[i]);
        }
        return result;
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Age\tCan Vote?");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i][0] + "\t" + results[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students (max 10): ");
        int numStudents = sc.nextInt();

        if (numStudents > 10) {
            System.out.println("Sorry, you can only input for a maximum of 10 students.");
            return;
        }

       
        int[] ages = generateAges(numStudents);

        // Check if the students can vote
        String[][] results = checkVotingEligibility(ages);

        // Display the results
        displayResults(results);
		
		sc.close();
    }
}
