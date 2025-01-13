import java.util.Scanner;

public class SpringSeason {

public static void checkSeason(int month, int day) {
if ((month > 3 || (month == 3 && day >= 20)) && (month < 6 || (month == 6 && day <= 20))) {
System.out.println("It's a Spring Season");
} else {
System.out.println("Not a Spring Season");
}

}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter month (1-12): ");
int month = sc.nextInt();
System.out.print("Enter day: ");
int day = sc.nextInt();

checkSeason(month, day);
        


}
}