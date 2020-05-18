import java.util.Scanner;

public class ComputeBMI {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// prompt user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		// prompt user to enter height in inches 
		System.out.print("Enter height in inches : ");
		double height = input.nextDouble();
		
		// convert kilograms per pound 
		final double KILOGRAMS_PER_POUND = 0.45359257;
		
		//convert meters per inch 
		final double METERS_PER_INCH = 0.0254;
		
		// Create variables to calculate BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		
		// Calculate BMI 
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		System.out.printf("Your BMI is %5.2f\n", bmi);
		
		if (bmi < 16) 
			System.out.println("Your are seriously underweight.");
			
		else if (bmi < 18) 
			System.out.println("You are underweight");
		
		else if (bmi < 24)
			System.out.println("You are normal weight");
		
		else if (bmi < 29)
			System.out.println("You are overweight");
		
		else
			System.out.println("You are gravely overweight");
		
			
		
	}

}
