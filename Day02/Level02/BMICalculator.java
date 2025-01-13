import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter your weight (in kg): ");
        double weight = sc.nextDouble();

          System.out.print("Enter your height (in cm): ");
        double heightInCm = sc.nextDouble();

        // Converting height from cm to meters
        double heightInMeters = heightInCm / 100.0;

        // formula BMI = weight / (height^2)
        double bmi = weight / (heightInMeters * heightInMeters);

        // Bmi result
        System.out.println("\nYour BMI is: " + bmi);

        // Determining the weight status based on the BMI value
        String weightStatus;

        if (bmi < 18.4) {
            weightStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            weightStatus = "Normal weight";
        } else if (bmi >= 25 && bmi < 39.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obesity";
        }

        //weight status
        System.out.println("The weight status of the person: " + weightStatus);

            }
}









