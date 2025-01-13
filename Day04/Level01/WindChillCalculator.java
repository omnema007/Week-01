import java.util.Scanner;

public class WindChillCalculator {

// Method to calculate the wind chill temperature
public static double calculateWindChill(double temperature, double windSpeed) {
        
double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

return windChill;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Get the temperature from the user
System.out.println("Enter the temperature in Fahrenheit: ");
double temperature = sc.nextDouble();

// Get the wind speed from the user
System.out.println("Enter the wind speed in miles per hour: ");
double windSpeed = sc.nextDouble();

// Calculate the wind chill temperature
double windChill = calculateWindChill(temperature, windSpeed);

// Display the result
System.out.println("The wind chill temperature is: " + windChill + "°F");
        

sc.close();
}
}
