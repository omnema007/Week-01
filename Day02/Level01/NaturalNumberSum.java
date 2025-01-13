import java.util.Scanner;

public class NaturalNumberSum {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number: ");
int number = sc.nextInt();

//check the natural number
if (number < 1) {
System.out.println("The number " + number + " is not a natural number");
return;
}

//compute using while
int sumUsingWhile = 0;
int i = 1;
while (i <= number) {
sumUsingWhile += i;
i++;
}

//compute using formula
int sumUsingFormula = number * (number + 1) / 2;

//comapre the result
System.out.print("Sum using while loop: " + sumUsingWhile);
System.out.println("Sum using formula: " + sumUsingFormula);

if (sumUsingWhile == sumUsingFormula) {
System.out.println("Both sum are equal");
}
else {
System.out.println("Both sum are not equal");
}

sc.close();
}
}