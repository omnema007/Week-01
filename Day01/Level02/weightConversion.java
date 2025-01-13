import java.util.Scanner;
public class WeightConversion {
public static void main(String[] args) {

//create scanner object for user input
Scanner sc = new Scanner(System.in);

//Input the weight in pounds
System.out.print("Enter the weight in pounds: ");
double weightInPounds = sc.nextDouble();

//Convert weight from pounds to kilograms (1 pound = 2.2 kg)
double weightInKg = weightInPounds * 2.2;

//Output the result
System.out.println("The weight of the person in pounds is " + weightInPounds +" and in kg is " + weightInKg);

sc.close();
}
}

