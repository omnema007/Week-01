import java.util.Scanner;

public class BasicCalculator {
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1-num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");

        int userInput = sc.nextInt();

        if (userInput == 1) {
            System.out.println("Addition: " + addition(num1, num2));
        }
        else if (userInput == 2) {
            System.out.println("Subtraction: " + subtraction(num1, num2));
        }
        else if (userInput == 3) {
            System.out.println("Multiplication: " + multiply(num1, num2));
        } else if (userInput == 4) {
            System.out.println("Division: " + division(num1, num2));
        }


    }
}
