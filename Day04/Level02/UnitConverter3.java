import java.util.Scanner;

public class UnitConverter3 {

// Method to convert Fahrenheit to Celsius
public static double convertFahrenheitToCelsius(double fahrenheit) {
double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
return fahrenheit2celsius;
}

// Method to convert Celsius to Fahrenheit
public static double convertCelsiusToFahrenheit(double celsius) {
double celsius2fahrenheit = (celsius * 9 / 5) + 32;
return celsius2fahrenheit;
}

// Method to convert pounds to kilograms
public static double convertPoundsToKilograms(double pounds) {
double pounds2kilograms = 0.453592;
return pounds * pounds2kilograms;
}

// Method to convert kilograms to pounds
public static double convertKilogramsToPounds(double kilograms) {
double kilograms2pounds = 2.20462;
return kilograms * kilograms2pounds;
}

// Method to convert gallons to liters
public static double convertGallonsToLiters(double gallons) {
double gallons2liters = 3.78541;
return gallons * gallons2liters;
}

// Method to convert liters to gallons
public static double convertLitersToGallons(double liters) {
double liters2gallons = 0.264172;
return liters * liters2gallons;
}

public static void main(String[] args) {
   
Scanner sc = new Scanner(System.in);

System.out.println("Enter the value in fahrenheit: ");
double fahrenheit = sc.nextDouble(); 
System.out.println("Enter the value in celsius: ");
double celsius = sc.nextDouble(); 
System.out.println("Enter the value in pounds: ");
double pounds = sc.nextDouble();
System.out.println("Enter the value in kilograms: "); 
double kilograms = sc.nextDouble();
System.out.println("Enter the value in gallons: "); 
double gallons = sc.nextDouble();
System.out.println("Enter the value in liters: "); 
double liters = sc.nextDouble(); 

System.out.println(fahrenheit + " Fahrenheit is equal to " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
System.out.println(celsius + " Celsius is equal to " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
System.out.println(pounds + " pounds is equal to " + convertPoundsToKilograms(pounds) + " kilograms.");
System.out.println(kilograms + " kilograms is equal to " + convertKilogramsToPounds(kilograms) + " pounds.");
System.out.println(gallons + " gallons is equal to " + convertGallonsToLiters(gallons) + " liters.");
System.out.println(liters + " liters is equal to " + convertLitersToGallons(liters) + " gallons.");
}
}