import java.util.Scanner;

public class StudentVoteChecker {

// Method to check if a student can vote or not
public boolean canStudentVote(int age) {
        
if (age < 0) {
return false;
}
   
if (age >= 18) {
return true; // Can vote
}
return false; 
}

public static void main(String[] args) {
// Create a scanner object for user input
Scanner sc = new Scanner(System.in);
        
// Create an instance of the StudentVoteChecker class
StudentVoteChecker checker = new StudentVoteChecker();
        
int[] studentAges = new int[10];
        
for (int i = 0; i < studentAges.length; i++) {
System.out.print("Enter the age of student " + (i + 1) + ": ");
studentAges[i] = sc.nextInt();
            
if (checker.canStudentVote(studentAges[i])) {
System.out.println("Student " + (i + 1) + " can vote.");
} else {
System.out.println("Student " + (i + 1) + " cannot vote.");
}
}
        
sc.close();
}
}
