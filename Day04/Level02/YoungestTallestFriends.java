import java.util.Scanner;

public class YoungestTallestFriends {

// Method to find the youngest among the 3 friends
public static String findYoungest(int[] ages) {
int youngestAge = ages[0];
String youngestFriend = "Amar"; 

if (ages[1] < youngestAge) {
youngestAge = ages[1];
youngestFriend = "Akbar";
}
if (ages[2] < youngestAge) {
youngestAge = ages[2];
youngestFriend = "Anthony";
}

return youngestFriend;
}

// Method to find the tallest among the 3 friends
public static String findTallest(double[] heights) {
double tallestHeight = heights[0];
String tallestFriend = "Amar"; // Default assuming Amar is the tallest initially

if (heights[1] > tallestHeight) {
tallestHeight = heights[1];
tallestFriend = "Akbar";
}
if (heights[2] > tallestHeight) {
tallestHeight = heights[2];
tallestFriend = "Anthony";
}

return tallestFriend;
}

public static void main(String[] args) {
// Create a scanner object for user input
Scanner sc = new Scanner(System.in);

int[] ages = new int[3];
double[] heights = new double[3];

// Taking user input for the ages and heights of Amar, Akbar, and Anthony
System.out.print("Enter the age of Amar: ");
ages[0] = sc.nextInt();
System.out.print("Enter the height of Amar (in meters): ");
heights[0] = sc.nextDouble();

System.out.print("Enter the age of Akbar: ");
ages[1] = sc.nextInt();
System.out.print("Enter the height of Akbar (in meters): ");
heights[1] = sc.nextDouble();

System.out.print("Enter the age of Anthony: ");
ages[2] = sc.nextInt();
System.out.print("Enter the height of Anthony (in meters): ");
heights[2] = sc.nextDouble();

String youngestFriend = findYoungest(ages);
String tallestFriend = findTallest(heights);

System.out.println("The youngest friend is: " + youngestFriend);
System.out.println("The tallest friend is: " + tallestFriend);

        
sc.close();
}
}
