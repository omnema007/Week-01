import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and return status
    public static double calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        height = height / 100;
        // Calculate BMI using the formula
        return weight / (height * height);
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    // Method to process the input and calculate BMI and status for all persons
    public static String[][] calculateBMIs(double[][] weightHeight) {
        String[][] result = new String[10][4]; // Array to store height, weight, BMI, and status
        
        for (int i = 0; i < 10; i++) {
            double weight = weightHeight[i][0];
            double height = weightHeight[i][1];
            
            double bmi = calculateBMI(weight, height);
            String status = getBMIStatus(bmi);
            
            // Store the results in the result array as string values
            result[i][0] = Double.toString(weight); // Weight
            result[i][1] = Double.toString(height); // Height
            result[i][2] = Double.toString(bmi);    // BMI
            result[i][3] = status;                  // Status
        }
        return result;
    }

    // Method to display the BMI information in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Person | Weight (kg) | Height (cm) | BMI    | Status");
        System.out.println("------------------------------------------------------------");
        
        for (int i = 0; i < 10; i++) {
            // Manually manage the string formatting for output
            String weight = results[i][0];
            String height = results[i][1];
            String bmi = results[i][2];
            String status = results[i][3];
            
            // Display the results for each person
            System.out.println((i + 1) + "       | " + weight + "        | " + height + "         | " + bmi + "    | " + status);
        }
    }

    // Main method to take input and display results
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] weightHeight = new double[10][2]; // Array to store weight and height for 10 persons
        
        // Input weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i+1) + ": ");
            weightHeight[i][0] = sc.nextDouble(); // Weight
            
            System.out.print("Enter height (in cm) for person " + (i+1) + ": ");
            weightHeight[i][1] = sc.nextDouble(); // Height
        }
        
        // Calculate BMI and status for each person
        String[][] results = calculateBMIs(weightHeight);
        
        // Display results in tabular format
        displayResults(results);
        
        sc.close();
    }
}
