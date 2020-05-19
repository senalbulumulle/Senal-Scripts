import java.util.Scanner;


public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// Create Scanner Variable 
		Scanner input =  new Scanner (System.in);
		
		// Prompt User to enter degrees in Fahrenheit.
		System.out.print(" Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		// Convert Fahrenheit to Celsius
		double celsius = (5.0 / 9)* (fahrenheit - 32);
		
		// Print what the result is
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
		

	}

}
