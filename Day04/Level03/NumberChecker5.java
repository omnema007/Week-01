import java.util.Scanner;

public class NumberChecker5 {

// Method to find factors of a number and return them as an array
public static int[] findFactors(int number) {
int count = 0;
       
// Count the number of factors
for (int i = 1; i <= number; i++) {
if (number % i == 0) {
count++;
}
}

int[] factors = new int[count];
int index = 0;

// Store the factors in the array
for (int i = 1; i <= number; i++) {
if (number % i == 0) {
factors[index++] = i;
}
}

return factors;
}

// Method to find the greatest factor of a number 
public static int findGreatestFactor(int[] factors) {
return factors[factors.length - 1]; 
}

// Method to find the sum of the factors 
public static int findSumOfFactors(int[] factors) {
int sum = 0;
for (int factor : factors) {
sum += factor;
}
return sum;
}

// Method to find the product of the factors 
public static int findProductOfFactors(int[] factors) {
int product = 1;
for (int factor : factors) {
product *= factor;
}
return product;
}

// Method to find the product of the cubes of the factors 
public static double findProductOfCubesOfFactors(int[] factors) {
double product = 1;
for (int factor : factors) {
product *= Math.pow(factor, 3); // Cube of the factor
}
return product;
}

// Method to check if a number is a perfect number
public static boolean isPerfectNumber(int number) {
int[] factors = findFactors(number);
int sum = findSumOfFactors(factors) - number; 
return sum == number;
}

// Method to check if a number is an abundant number
public static boolean isAbundantNumber(int number) {
int[] factors = findFactors(number);
int sum = findSumOfFactors(factors) - number; // Subtract the number itself
return sum > number;
}

// Method to check if a number is a deficient number
public static boolean isDeficientNumber(int number) {
int[] factors = findFactors(number);
int sum = findSumOfFactors(factors) - number; 
return sum < number;
}

// Method to check if a number is a strong number
public static boolean isStrongNumber(int number) {
int sum = 0;
int originalNumber = number;

while (number > 0) {
int digit = number % 10;
sum += factorial(digit); // Add the factorial of the digit
number /= 10;
}

return sum == originalNumber;
}

// Helper method to calculate the factorial of a number
public static int factorial(int n) {
int result = 1;
for (int i = 1; i <= n; i++) {
result *= i;
}
return result;
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter the number: ");
int number = sc.nextInt(); 

// Find factors
int[] factors = findFactors(number);
System.out.print("Factors of " + number + ": ");
for (int factor : factors) {
System.out.print(factor + " ");
}
System.out.println();

// Find greatest factor
int greatestFactor = findGreatestFactor(factors);
System.out.println("Greatest Factor: " + greatestFactor);

// Find sum of factors
int sumOfFactors = findSumOfFactors(factors);
System.out.println("Sum of Factors: " + sumOfFactors);

// Find product of factors
int productOfFactors = findProductOfFactors(factors);
System.out.println("Product of Factors: " + productOfFactors);

// Find product of cubes of factors
double productOfCubes = findProductOfCubesOfFactors(factors);
System.out.println("Product of Cubes of Factors: " + productOfCubes);

// Check if the number is perfect
boolean perfect = isPerfectNumber(number);
System.out.println("Is Perfect Number: " + perfect);

// Check if the number is abundant
boolean abundant = isAbundantNumber(number);
System.out.println("Is Abundant Number: " + abundant);

// Check if the number is deficient
boolean deficient = isDeficientNumber(number);
System.out.println("Is Deficient Number: " + deficient);

// Check if the number is strong
boolean strong = isStrongNumber(number);
System.out.println("Is Strong Number: " + strong);

sc.close();
}
}
