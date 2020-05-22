import java.util.Scanner;


public class ComputeLoan {

	public static void main(String[] args) {
		// Create a Scanner Object 
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter yearly interest rate 
		System.out.print("Enter yearly interest rate, for example 8.25: ");
		double annualInterestRate = input.nextDouble();
		
		// Calculate the monthly interest rate 
		double monthlyInterestRate = annualInterestRate / 1200;
		
		// Prompt User for how long the loan lasts. 
		System.out.print("Enter number of years as an integer, for example: 5: ");
		int numberOfYears = input.nextInt();
		
		// Prompt User for loan amount.
		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();
		
		// Calculate monthly payments 
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		
		// Calculate total payments 
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
	    // Display Results 
		System.out.println("The monthly payment is " + (int) (monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is " + (int) (totalPayment * 100) / 100.0);
		
		

	}

}
