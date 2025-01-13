import java.util.Scanner;

public class FactorCalculator {

// Method to find the factors of the number and return them in an array
public static int[] findFactors(int number) {
int count = 0;
        
for (int i = 1; i <= number; i++) {
if (number % i == 0) {
count++;
}
}

        
int[] factors = new int[count];
int index = 0;

for (int i = 1; i <= number; i++) {
if (number % i == 0) {
factors[index] = i;
index++;
}
}

return factors;
}

// Method to calculate the sum of the factors
public static int sumOfFactors(int[] factors) {
int sum = 0;
for (int factor : factors) {
sum += factor;
}
return sum;
}

// Method to calculate the product of the factors
public static int productOfFactors(int[] factors) {
int product = 1;
for (int factor : factors) {
product *= factor;
}
return product;
}

// Method to calculate the sum of the squares of the factors
public static double sumOfSquareOfFactors(int[] factors) {
double sumOfSquares = 0;
for (int factor : factors) {
sumOfSquares += Math.pow(factor, 2);
}
return sumOfSquares;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Get the number from the user
System.out.println("Enter a number: ");
int number = sc.nextInt();

// Find the factors of the number
int[] factors = findFactors(number);

// Display the factors
System.out.print("Factors of " + number + " are: ");
for (int factor : factors) {
System.out.print(factor + " ");
}
System.out.println();

// Calculate and display the sum of the factors
int sum = sumOfFactors(factors);
System.out.println("Sum of factors: " + sum);

// Calculate and display the product of the factors
int product = productOfFactors(factors);
System.out.println("Product of factors: " + product);

// Calculate and display the sum of the squares of the factors
double sumOfSquares = sumOfSquareOfFactors(factors);
System.out.println("Sum of square of factors: " + sumOfSquares);

sc.close();
}
}
