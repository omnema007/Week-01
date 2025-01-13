import java.util.Scanner;

public class SumOfNaturalNumbers {

// Method to find the sum of n natural numbers using recursion
public static int recursiveSum(int n) {
if (n == 1) {
return 1;  
} else {
return n + recursiveSum(n - 1);  // Recursive case: sum(n) = n + sum(n-1)
}
}    
// Method to find the sum of n natural numbers using the formula
public static int formulaSum(int n) {
return n * (n + 1) / 2;  // Sum of first n natural numbers formula
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Get the user input for n
System.out.println("Enter a natural number: ");
int n = sc.nextInt();

if (n <= 0) {
System.out.println("Please enter a positive natural number.");
} else {
           
int recursiveResult = recursiveSum(n);

int formulaResult = formulaSum(n);

// Display the results and compare
System.out.println("Sum using recursion: " + recursiveResult);
System.out.println("Sum using formula: " + formulaResult);

if (recursiveResult == formulaResult) {
System.out.println("Both results are correct and match!");
} else {
System.out.println("There seems to be an error. The results do not match.");
}
}

sc.close();
}
}