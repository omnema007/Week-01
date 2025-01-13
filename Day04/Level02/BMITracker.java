import java.util.Scanner;

public class BMITracker {

// Method to calculate BMI and populate the array
public void calculateBMI(double[][] data) {
for (int i = 0; i < data.length; i++) {
double weight = data[i][0];
double heightInMeters = data[i][1] / 100; 
data[i][2] = weight / (heightInMeters * heightInMeters); // Calculate BMI
}
}

// Method to determine BMI status
public String[] determineBMIStatus(double[][] data) {
String[] statuses = new String[data.length];
for (int i = 0; i < data.length; i++) {
double bmi = data[i][2];
if (bmi < 18.5) {
statuses[i] = "Underweight";
} else if (bmi >= 18.5 && bmi < 25) {
statuses[i] = "Normal weight";
} else if (bmi >= 25 && bmi < 30) {
statuses[i] = "Overweight";
} else {
statuses[i] = "Obesity";
}
}
return statuses;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Create a 2D array to store weight, height, and BMI
double[][] data = new double[10][3];
BMITracker tracker = new BMITracker();

// Input weight and height for 10 members
for (int i = 0; i < 10; i++) {
System.out.printf("Enter weight (in kg) for person %d: ", i + 1);
data[i][0] = sc.nextDouble();

System.out.printf("Enter height (in cm) for person %d: ", i + 1);
data[i][1] = sc.nextDouble();
}

// Calculate BMI
tracker.calculateBMI(data);

// Determine BMI statuses
String[] statuses = tracker.determineBMIStatus(data);

// Display results
System.out.println("\nResults:");
System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
for (int i = 0; i < data.length; i++) {
System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", data[i][0], data[i][1], data[i][2], statuses[i]);
}

sc.close();
}
}
