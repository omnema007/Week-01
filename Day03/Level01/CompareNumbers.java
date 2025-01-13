import java.util.Scanner;

public class CompareNumbers {
public static void main(String[] args) {

//cretae scanner object for user input
Scanner sc = new Scanner(System.in);

//define array
int[] arr = new int[5];

//taking user input
for (int i = 0; i < arr.length; i++) {
System.out.print("Enter the number " + (i + 1) + ": ");
 arr[i] = sc.nextInt();
}

for (int i = 0; i < arr.length; i++) {
//if number is positive
if (arr[i] > 0) {

//check even or odd
if (arr[i] % 2 == 0) {
System.out.println("The number " + arr[i] + " is even");
}
else {
System.out.println("The number " + arr[i] + " is odd");
}

} else if (arr[i] < 0) {
System.out.println("Negative");
} else {
System.out.println("Zero");
}
}

//compare the first and last element
int firstElement = arr[0];
int lastElement = arr[arr.length - 1];

if (firstElement == lastElement) {
System.out.println("The first and last numbers are equal.");
} else if ( firstElement > lastElement) {
System.out.println("The first number is greater than last number.");
} else {
System.out.println("The first number is less than the last number.");
}

sc.close();
}
}