import java.util.Scanner;

public class MeanHeight {
public static void main(String[] args) {

//create scanner object for user input
Scanner sc = new Scanner(System.in);

//define array
double[] heights = new double[11];

//taking user input
for (int i = 0; i < heights.length; i++) {
System.out.print("Enter the height of player " + (i+1) + ": " );
heights[i] = sc.nextDouble();
}

double sum = 0.0;

for (int i = 0; i < heights.length; i++) {
sum += heights[i];
}

double meanOfHeight = sum / 11;

System.out.println("Mean height of football team is: " + meanOfHeight);
}
}