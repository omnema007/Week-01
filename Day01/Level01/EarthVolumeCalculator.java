import java.util.*;
public class EarthVolumeCalculator{
public static void main(String[] args) {

//radius in km
double radius = 6378;

//calculate volume of earth
double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

//convert volume fro km to miles
double kmToMiles = 0.621371;
double volumeInMiles = volume * Math.pow(kmToMiles, 3);

//display the result
System.out.println("The volume of earth in cubic kilometers is " + volume + " and cubic miles is " + volumeInMiles);
}
