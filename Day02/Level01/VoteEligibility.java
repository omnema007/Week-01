import java.util.Scanner;
public class VoteEligibility {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

//take user input 
System.out.println("Enter the person's age: ");
int age = sc.nextInt();

//check voting eligibility
if (age >= 18) {
System.out.println("The person's age is " + age + " and can vote");
}
else {
System.out.println("The person's age is " + age + " and cannot vote");

sc.close();
}
}
}