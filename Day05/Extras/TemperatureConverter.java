import java.util.Scanner;

public class TemperatureConverter {

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       System.out.println("Enter temperature in Fahrenheit: ");
       double fahrenheit = sc.nextDouble();

       System.out.println("Enter temperature in Celsius: ");
       double celsius = sc.nextDouble();

       System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
       System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
        
        sc.close();
    }
}
