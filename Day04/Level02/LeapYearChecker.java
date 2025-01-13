import java.util.Scanner;

public class LeapYearChecker {

// Method to check if a year is a leap year
public static boolean isLeapYear(int year) {
       
if (year < 1582) {
System.out.println("Year must be 1582 or later.");
return false;
}

// Leap year conditions
if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
return true;
} else {
return false;
}
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Get the year from the user
System.out.println("Enter a year: ");
int year = sc.nextInt();

// Check if the year is a leap year
if (isLeapYear(year)) {
System.out.println(year + " is a Leap Year.");
} else {
System.out.println(year + " is not a Leap Year.");
}

 sc.close();
}
}