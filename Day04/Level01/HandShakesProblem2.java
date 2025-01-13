import java.util.Scanner;

public class HandShakesProblem2 {

//method to calculate maximum number of handshakes
public static int numberOfHandshakes(int n) {
return ( (n * (n - 1)) / 2);
}
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number: ");
int numberOfStudents = sc.nextInt();

System.out.println("The number of HandShakes is " + numberOfHandshakes(numberOfStudents));

sc.close();


}
}