import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        // Define a formatter for date parsing and output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("Enter a date in dd-MM-yyyy format: ");
        String inputDate = sc.nextLine();

        LocalDate date = LocalDate.parse(inputDate, formatter);

        LocalDate modifiedDate = date.plusDays(7)      
                                     .plusMonths(1)    
                                     .plusYears(2)     
                                     .minusWeeks(3);   

        // Display the resulting date
        System.out.println("Resulting Date: " + modifiedDate.format(formatter));

        
        sc.close();
    }
}


