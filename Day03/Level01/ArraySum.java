import java.util.Scanner;

public class ArraySum {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

double[] arr = new double[10];
double total = 0.0;
int index = 0;

while (true) {
System.out.print("Enter a number (0 or negative to stop): ");
double input = sc.nextDouble();

if (input <= 0) {
break;
}

if (index == 10) {
System.out.println("Array is full");
break;
}

arr[index] = input;
index++;
}

for (int i = 0; i < index; i++) {
total += arr[i];
}

System.out.println("Entered numbers are: ");
for (int i = 0; i < index; i++) {
System.out.print(arr[i] + " ");
}
System.out.println();

System.out.println("The total sum of the number is " + total);

sc.close();
}
}