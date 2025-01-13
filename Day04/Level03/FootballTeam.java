import java.util.Random;

public class FootballTeam {

// Method to generate random heights for the players
public int[] generateRandomHeights(int size) {
int[] heights = new int[size];
Random random = new Random();
for (int i = 0; i < size; i++) {
heights[i] = 150 + random.nextInt(101); // Generate random height between 150 and 250 cm
}
return heights;
}

// Method to calculate the sum of all heights
public int calculateSum(int[] heights) {
int sum = 0;
for (int height : heights) {
sum += height;
}
return sum;
}

// Method to calculate the mean height
public double calculateMean(int[] heights) {
int sum = calculateSum(heights);
return (double) sum / heights.length;
}

// Method to find the shortest height
public int findShortestHeight(int[] heights) {
int shortest = heights[0];
for (int height : heights) {
if (height < shortest) {
shortest = height;
}
}
return shortest;
}

// Method to find the tallest height
public int findTallestHeight(int[] heights) {
int tallest = heights[0];
for (int height : heights) {
if (height > tallest) {
tallest = height;
}
}
return tallest;
}

public static void main(String[] args) {
FootballTeam stats = new FootballTeam();

// Generate random heights for 11 players
int[] heights = stats.generateRandomHeights(11);

// Display the heights
System.out.println("Player Heights (in cm):");
for (int height : heights) {
System.out.print(height + " ");
}
System.out.println();

// Calculate and display results
double meanHeight = stats.calculateMean(heights);
int shortestHeight = stats.findShortestHeight(heights);
int tallestHeight = stats.findTallestHeight(heights);

System.out.println("\nResults:");
System.out.printf("Mean Height: %.2f cm%n", meanHeight);
System.out.println("Shortest Height: " + shortestHeight + " cm");
System.out.println("Tallest Height: " + tallestHeight + " cm");
}
}
