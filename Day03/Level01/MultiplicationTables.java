import java.util.Scanner;

public class MultiplicationTables {
public static void main(String[] args) {

//create scanner object for user input
Scanner sc = new Scanner(System.in);

//take the user input
System.out.print("Enter the number: ");
int number = sc.nextInt();

//define array
int[] arr = new int[10];

//generate table
for (int i = 0; i < arr.length; i++) {
arr[i] = number * (i + 1);
}

//display the result
for (int i = 0; i < arr.length; i++) {
System.out.println(number + " * " + (i+1) + " = " + arr[i]);
}

sc.close();
}
}