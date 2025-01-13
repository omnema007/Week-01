import java.util.Scanner;

public class OddEvenArrays {
public static void main(String[] args) {

//create scanner object for user input
Scanner sc = new Scanner(System.in);


System.out.print("Enter the number: ");
int number = sc.nextInt();

if (number <= 0) {
System.out.println("Enter a natural number");
return;
}

int[] oddArray = new int[number / 2 + 1];
int[] evenArray = new int[number / 2 + 1];

int oddIndex = 0;
int evenIndex = 0;

for (int i = 1; i <= number; i++) {
if (i % 2 == 0) {
evenArray[evenIndex] = i;
evenIndex++;
} else {
oddArray[oddIndex] = i;
oddIndex++;
}
}

System.out.println("Odd Numbers: ");
for (int i = 0; i < oddIndex; i++) {
System.out.print(oddArray[i] + " ");
}
System.out.println();

System.out.println("Even Numbers: ");
for (int i = 0; i < evenIndex; i++) {
System.out.print(evenArray[i] + " ");
}


sc.close();
}
}