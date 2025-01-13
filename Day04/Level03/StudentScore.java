import java.util.Random;
import java.util.Scanner;

public class StudentScore {

// Method to generate random scores for Physics, Chemistry, and Math
public static int[][] generateScores(int numberOfStudents) {
Random random = new Random();
int[][] scores = new int[numberOfStudents][3]; // [][0] -> Physics, [][1] -> Chemistry, [][2] -> Math

for (int i = 0; i < numberOfStudents; i++) {
scores[i][0] = 50 + random.nextInt(51); // Physics score between 50 and 100
scores[i][1] = 50 + random.nextInt(51); // Chemistry score between 50 and 100
scores[i][2] = 50 + random.nextInt(51); // Math score between 50 and 100
}
return scores;
}

// Method to calculate total, average, and percentage
public static double[][] calculateTotals(int[][] scores) {
double[][] results = new double[scores.length][3]; // [][0] -> Total, [][1] -> Average, [][2] -> Percentage

for (int i = 0; i < scores.length; i++) {
int total = scores[i][0] + scores[i][1] + scores[i][2];
double average = (double) total / 3;
double percentage = (total / 300.0) * 100;

results[i][0] = total;
results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
}
return results;
}

// Method to display the scorecard
public static void displayScorecard(int[][] scores, double[][] results) {
System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
for (int i = 0; i < scores.length; i++) {
System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f%n",
                    (i + 1),
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2]);
}
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate scores
        int[][] scores = generateScores(numberOfStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateTotals(scores);

        // Display scorecard
        displayScorecard(scores, results);

        scanner.close();
    }
}
