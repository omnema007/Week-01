import java.util.Scanner;

public class MultiToSingleDimensional {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

// Get the number of rows and columns from the user
System.out.println("Enter the number of rows: ");
int rows = sc.nextInt();
System.out.println("Enter the number of columns: ");
int columns = sc.nextInt();

//create a 2D array and take user input
int[][] matrix = new int[rows][columns];
System.out.println("Enter the elements of the matrix: ");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
matrix[i][j] = sc.nextInt();
}
}

//create 1D array to store elements of 2D array
int[] arr = new int[rows * columns];
int index = 0;

//Copy elements from the 2D array to the 1D array
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
arr[index] = matrix[i][j];
index++;
}
}

//display the 2D array
System.out.println("2D Array: ");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
System.out.print(matrix[i][j] + " ");
}
System.out.println();
}

//display the 1D array
System.out.println("1D Array: ");
for (int i = 0; i < arr.length; i++) {
System.out.print(arr[i] + " ");
}


sc.close();
}
}