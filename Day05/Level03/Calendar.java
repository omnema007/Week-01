import java.util.Scanner;

public class Calendar {

    // Array to store month names
    private static final String[] MONTHS = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    private static final int[] DAYS_IN_MONTH = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a given month and year
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29; 
        }
        return DAYS_IN_MONTH[month - 1];
    }

    // Method to calculate the first day of the month
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = MONTHS[month - 1];
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

       
        System.out.println("     " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

      
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

         
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); 
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the month and year
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Display the calendar
        displayCalendar(month, year);

        sc.close();
    }
}
