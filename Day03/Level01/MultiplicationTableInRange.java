import java.util.Scanner;

public class MultiplicationTableInRange {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int number = sc.nextInt();

int[] arr = new int[4];

for (int i = 6; i <= 9; i++) {
arr[i - 6] = number * i;
}

for (int i = 0; i < arr.length; i++) {
System.out.println(number + " * " + i + " = " + arr[i]);
}

sc.close();
}
}