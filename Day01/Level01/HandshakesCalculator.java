
import java.util.Scanner;
public class HandshakesCalculator {
public static void main(String[] args) {

//create scanner object to take user input
Scanner sc = new Scanner(System.in);

//take user input
System.out.println("Enter the number of students: ");
int numberOfStudents = sc.nextInt();

//calculate the maximum number of handshakes
int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

//display the result
System.out.println("The number of possible handshakes " + handshakes);

sc.close();
}
}

