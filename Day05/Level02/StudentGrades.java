import java.util.Random;

public class StudentGrades {
    public static void main(String[] args) {
        int numStudents = 5; // Define the number of students
        int[][] marks = generateMarks(numStudents);
        double[][] results = calculateResults(marks);
        String[][] grades = calculateGrades(results);

        displayScorecard(marks, results, grades);
    }

    // Method to generate random 2-digit scores for PCM
    public static int[][] generateMarks(int numStudents) {
        Random rand = new Random();
        int[][] marks = new int[numStudents][3]; // PCM for each student
        
        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = rand.nextInt(51) + 50; // Physics marks (50 to 100)
            marks[i][1] = rand.nextInt(51) + 50; // Chemistry marks (50 to 100)
            marks[i][2] = rand.nextInt(51) + 50; // Math marks (50 to 100)
        }
        
        return marks;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][4]; // Total, Average, Percentage, Rounded Percentage

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
            results[i][3] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }
        
        return results;
    }

    // Method to calculate grade based on percentage
    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][1];
        
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][3];

            if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "R"; // Remedial
            }
        }
        
        return grades;
    }

    // Method to display scorecard in a tabular format
    public static void displayScorecard(int[][] marks, double[][] results, String[][] grades) {
        // Display header
        System.out.println("Student  Physics  Chemistry  Math  Total  Percentage  Grade");

        // Display each student's information
        for (int i = 0; i < marks.length; i++) {
            System.out.print((i + 1) + "       ");
            System.out.print(marks[i][0] + "       ");
            System.out.print(marks[i][1] + "        ");
            System.out.print(marks[i][2] + "    ");
            System.out.print((int) results[i][0] + "      ");
            System.out.print(results[i][3] + "      ");
            System.out.println(grades[i][0]);
        }
    }
}
