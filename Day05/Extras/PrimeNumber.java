import java.util.Scanner;

public class PrimeNumber {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        
        if (number < 2) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
