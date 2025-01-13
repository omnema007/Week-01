import java.util.Scanner;
public class RocketLaunchCountdownUsingForLoop {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter the countdown starting number: ");
int counter = sc.nextInt();

//countdown using the for loop
for (int i = counter; i >= 1; i--) {
System.out.println(i);
}


sc.close();
}
}