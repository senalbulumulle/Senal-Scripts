import java.util.Scanner;



public class CalculateBMI {

	public static void main(String[] args) {
		
		// Create a new Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		
		// Create a new Scanner Variable called "weight"
		double weight = input.nextDouble();
		
		// Prompt the user to enter height in inches
		System.out.print("Enter height in inches: ");
		
		// Create new Scanner Variable called "height"
		double height = input.nextDouble();
		
		// Create a constant called "KILOGRAMS_PER_POUND"
		final double KILOGRAMS_PER_POUND = 0.45359237;
		
		// Create a constant called "METERS_PER_INCH"
		final double METERS_PER_INCH = 0.0254;
		
		// Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		// Display results in if-else statements
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("UnderWeight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");

	}

}
