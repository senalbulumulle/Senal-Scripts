import java.util.Scanner;



public class CarLoan {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the price of a car
		System.out.print("Enter the price of a car: ");
		
		// Make a double variable for the price of a car
		double priceOfCar = input.nextDouble();
		
		// Prompt User to enter the down payment
		System.out.print("Enter the down payment: ");
		
		// Make a double variable for down payment 
		double downPayment = input.nextDouble();
		
		// Make a double variable for the loan 
		double loan = priceOfCar - downPayment;
		
		// Prompt the user to enter the loan price
		System.out.println("The loan price will be $" + loan);

	}

}
