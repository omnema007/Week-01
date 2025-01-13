import java.util.Scanner;

public class EmployeeBonus {

public static void main(String[] args) {
// Create a scanner object for user input
Scanner sc = new Scanner(System.in);

double[] salary = new double[10];
int[] yearsOfService = new int[10];
double[] bonus = new double[10];
double[] newSalary = new double[10];

double totalBonus = 0;
double totalOldSalary = 0;
double totalNewSalary = 0;

for (int i = 0; i < 10; i++) {
System.out.print("Enter salary for employee " + (i + 1) + ": ");
salary[i] = sc.nextDouble();
if (salary[i] <= 0) {
System.out.println("Invalid salary. Please enter a valid positive salary.");
i--; 
continue;
}

System.out.print("Enter years of service for employee " + (i + 1) + ": ");
yearsOfService[i] = sc.nextInt();
if (yearsOfService[i] < 0) {
System.out.println("Invalid years of service. Please enter a valid number.");
i--; 
continue;
}

            
totalOldSalary += salary[i];
}

// Loop to calculate bonus and new salary for 10 employees
for (int i = 0; i < 10; i++) {
            
if (yearsOfService[i] > 5) {
bonus[i] = salary[i] * 0.05; // 5% bonus for more than 5 years
} else {
bonus[i] = salary[i] * 0.02; // 2% bonus for 5 years or less
}

// Calculate new salary
newSalary[i] = salary[i] + bonus[i];

totalBonus += bonus[i];
totalNewSalary += newSalary[i];
}

System.out.println("\nTotal bonus payout: " + totalBonus);
System.out.println("Total old salary: " + totalOldSalary);
System.out.println("Total new salary (including bonus): " + totalNewSalary);

sc.close();
}
}