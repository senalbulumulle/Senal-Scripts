import java.util.Scanner;

public class BucketFill {

	public static void main(String[] args) {
		
		// Create a new Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user with the amount of gallons
		System.out.print("How many gallons does the bucket hold? ");
		
		
		// Create a Scanner Variable called gallons
		int gallons = input.nextInt();
	
		
		// Prompt the user to enter the flowrate
		System.out.print("Enter the flowrate of the water hose: ");
		
		
		// Create a scanner variable called flowrate
		double flowrate = input.nextDouble();
		
		
		// Create a scanner variable to show how much time it will take a bucket to fill up
		double time = gallons/flowrate;
		
		// Prompt the user the output
		System.out.println("The bucket will be filed in the following number of minutes: " + time);
		
		
	}

}