import java.util.Scanner;



public class ChangeFrom20 {

	public static void main(String[] args) {
		// Create a new Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the cost 
		System.out.print("Enter the cost of your item less than $20: ");
		
		// Make a double variable for the cost
		double cost = input.nextDouble();
		
		// Make a double variable for the change
		double change = 20 - cost;
		
		// Prompt user the change
		System.out.println("The change will be $ " + change);

	}

}
