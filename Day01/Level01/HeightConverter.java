import java.util.Scanner;
public class HeightConverter {
public static void main(String[] args) {

//create scanner object to take input from the user
Scanner sc = new Scanner(System.in);

System.out.println("Enter your height in centimeters: ");
double height = sc.nextDouble();

//convert centimeters to inch
double heightInInches = height / 2.54;

int feet = (int)heightInInches / 12;
int inches = (int)heightInInches % 12;

//display the result
System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inches);

sc.close();

}
}

