import java.util.Scanner;

public class FindMaximumOfThree {
    public static int findMaximum(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        int maximum = findMaximum(num1, num2, num3);
        System.out.println("Maximum number is: " + maximum);
    }
}
