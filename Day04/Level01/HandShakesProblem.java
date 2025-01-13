import java.util.Scanner;

public class HandShakesProblem {

//method to calculate maximum number of handshakes
public static int numberOfHandshakes(int n) {
return ( (n * (n - 1)) / 2);
}
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number: ");
int number = sc.nextInt();

System.out.println("The number of HandShakes is " + numberOfHandshakes(number));

sc.close();


}
}