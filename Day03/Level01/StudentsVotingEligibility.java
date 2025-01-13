import java.util.Scanner;
public class StudentsVotingEligibility {
public static void main(String[] args) {

//create scanner object to take user input
Scanner sc = new Scanner(System.in);

//define array
int[] arr = new int[10];

//taking user input
for (int i = 0; i < arr.length; i++) {
System.out.print("Enter the age of student " + (i + 1) + ": ");
 arr[i] = sc.nextInt();
}

for (int i = 0; i < arr.length; i++) {
if (arr[i] < 0) {
System.out.println("Invalid age");
} else if (arr[i] >= 18) {
System.out.println("The student with the age " + arr[i] + " can vote");
} else {
System.out.println("The student with the age " + arr[i] + " cannot vote");
}
}

sc.close();

}
}