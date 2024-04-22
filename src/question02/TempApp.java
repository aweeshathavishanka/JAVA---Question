package question02;


//TempApp.java
import java.util.Scanner;

public class TempApp {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Creating the TemperatureConverter objects
     TemperatureConverter tempConverterCelsius = new TemperatureConverter();
     TemperatureConverter tempConverterFahrenheit = new TemperatureConverter();

     // Taking user input for Celsius
     System.out.print("Enter the temperature in Celsius: ");
     double celsius = scanner.nextDouble();
     double convertedFahrenheit = tempConverterCelsius.celsiusToFahrenheit(celsius);

     // Taking user input for Fahrenheit
     System.out.print("Enter the temperature in Fahrenheit: ");
     double fahrenheit = scanner.nextDouble();
     double convertedCelsius = tempConverterFahrenheit.fahrenheitToCelsius(fahrenheit);

     // Printing the results
     System.out.println(celsius + " Celsius is equal to " + convertedFahrenheit + " Fahrenheit");
     System.out.println(fahrenheit + " Fahrenheit is equal to " + convertedCelsius + " Celsius");

     scanner.close();
 }
}

