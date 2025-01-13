import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // Step 1: Declare two double variables and one String variable for the operator
        double first, second;
        String op;

        // Step 2: Get input values for the two numbers and the operator
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /): ");
        op = scanner.next();

        // Step 3: Use a switch...case to perform operations based on the operator
        double result = 0;
        boolean validOperator = true;
        
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                // Check for division by zero
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                validOperator = false;
        }

        // Step 4: If the operator was valid, print the result
        if (validOperator) {
            System.out.println("The result is: " + result);
        }

        scanner.close();
    }
}