import java.util.Scanner;

public class YoungestAndTallest {

public static void main(String[] args) {
// Create a scanner object for user input
Scanner sc = new Scanner(System.in);

int[] age = new int[3];
double[] height = new double[3];
String[] names = {"Amar", "Akbar", "Anthony"};

for (int i = 0; i < 3; i++) {
System.out.print("Enter age of " + names[i] + ": ");
age[i] = sc.nextInt();

System.out.print("Enter height of " + names[i] + " (in meters): ");
height[i] = sc.nextDouble();
}

int youngestAge = age[0];
int youngestIndex = 0;
double tallestHeight = height[0];
int tallestIndex = 0;

// Loop through the arrays to find the youngest and tallest
for (int i = 1; i < 3; i++) {
            
if (age[i] < youngestAge) {
youngestAge = age[i];
youngestIndex = i;
}

if (height[i] > tallestHeight) {
tallestHeight = height[i];
tallestIndex = i;
}
}

// Display the youngest and tallest
System.out.println("\nThe youngest friend is: " + names[youngestIndex] + " with age " + youngestAge);
System.out.println("The tallest friend is: " + names[tallestIndex] + " with height " + tallestHeight + " meters");

        
sc.close();
}
}