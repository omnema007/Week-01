import java.util.Arrays;

public class RandomNumberStats {

// Method to generate an array of random 4-digit numbers
public int[] generate4DigitRandomArray(int size) {
int[] numbers = new int[size];
for (int i = 0; i < size; i++) {
numbers[i] = 1000 + (int) (Math.random() * 9000); 
}
return numbers;

}

// Method to calculate average, minimum, and maximum of an array
public double[] findAverageMinMax(int[] numbers) {
int sum = 0;
int min = numbers[0];
int max = numbers[0];

for (int num : numbers) {
sum += num; 
if (num < min) {
min = num;
}  
if (num > max) {
max = num; 
}

}

double average = (double) sum / numbers.length; // Calculate average
return new double[] { average, min, max };
}

public static void main(String[] args) {
RandomNumberStats stats = new RandomNumberStats();

int[] randomNumbers = stats.generate4DigitRandomArray(5);
System.out.println("Random Numbers: " + Arrays.toString(randomNumbers));

// Calculate average, min, and max
double[] results = stats.findAverageMinMax(randomNumbers);
System.out.println("Average: " + results[0]);
System.out.println("Minimum: " + (int) results[1]);
System.out.println("Maximum: " + (int) results[2]);
}
}
