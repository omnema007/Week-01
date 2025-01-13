import java.util.Scanner;
public class RocketLaunchCountdown {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter the countdown starting number: ");
int counter = sc.nextInt();

//countdown using the while loop
while (counter >= 1) {
System.out.println(counter);
counter--;
}

sc.close();
}
}