import java.util.Scanner;


public class CalculateMilesPerGallon {

	public static void main(String[] args) {
		// Create a Scanner Variable 
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the amount of miles traveled. 
		System.out.print("Enter the amount of miles traveled last month: ");
		int miles = input.nextInt();
		
		// Prompt user to enter how many gallons they used. 
		System.out.print("Enter the amount of gallons used last month: ");
		int gallons = input.nextInt();
		
		// Calculate the amount of miles per gallon
		int mpg = miles / gallons;
		
		// Displays the Answer 
		System.out.print("Your Car's miles per gallon is: " + mpg);
		
		
		

	}

}
