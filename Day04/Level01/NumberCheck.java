import java.util.Scanner;

public class NumberCheck {

// Method to check whether the number is positive, negative, or zero
public static int checkNumber(int number) {
if (number > 0) {
return 1; // Positive
} else if (number < 0) {
return -1; // Negative
} else {
return 0; // Zero
}
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Get input from the user
System.out.println("Enter an integer: ");
int number = sc.nextInt();


int result = checkNumber(number);

// Display the result
if (result == 1) {
System.out.println("The number is positive.");
} else if (result == -1) {
System.out.println("The number is negative.");
} else {
System.out.println("The number is zero.");
}

sc.close();
}
}
