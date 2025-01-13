import java.util.Scanner;

public class NumberChecker4 {

// Method to check if a number is prime
public static boolean isPrime(int number) {
if (number <= 1) {
return false; // Prime numbers are greater than 1
}
for (int i = 2; i <= Math.sqrt(number); i++) {
if (number % i == 0) {
return false; 
}
}
return true; 
}

// Method to check if a number is neon number
public static boolean isNeon(int number) {
int square = number * number;
int sumOfDigits = 0;

// Sum the digits of the square of the number
while (square > 0) {
sumOfDigits += square % 10;
square /= 10;
}

return sumOfDigits == number; 
}

// Method to check if a number is spy number
public static boolean isSpy(int number) {
int sum = 0;
int product = 1;
        
while (number > 0) {
int digit = number % 10;
sum += digit;       
product *= digit;   
number /= 10;
}

return sum == product; 
}

// Method to check if a number is automorphic number
public static boolean isAutomorphic(int number) {
int square = number * number;
        
// Check if the square ends with the number itself
while (square > 0) {
if (square % 10 != number % 10) {
return false; 
}
square /= 10;
number /= 10;
}

return true; 
}

// Method to check if a number is buzz number
public static boolean isBuzz(int number) {
return number % 7 == 0 || number % 10 == 7; // Check divisibility by 7 or ends with 7
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter the number: ");
int number = sc.nextInt(); 

// Check if the number is prime
boolean prime = isPrime(number);
System.out.println("Is Prime: " + prime);

// Check if the number is a neon number
boolean neon = isNeon(number);
System.out.println("Is Neon: " + neon);

// Check if the number is a spy number
boolean spy = isSpy(number);
System.out.println("Is Spy: " + spy);

// Check if the number is an automorphic number
boolean automorphic = isAutomorphic(number);
System.out.println("Is Automorphic: " + automorphic);

// Check if the number is a buzz number
boolean buzz = isBuzz(number);
System.out.println("Is Buzz: " + buzz);

sc.close();
}
}
