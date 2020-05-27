import java.util.Scanner;


public class LoanSchedule {

	public static void main(String[] args) {
		// Create two variables 
		int numOfYears;
		double loanAmount;
		double annualInterestRate;
		
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt User for Loan Amount
		System.out.print("Enter loan amount, for example 120000.95: ");
		loanAmount = input.nextDouble();
		
		// Prompt User for number of years the loan is 
		System.out.print("Enter number of years as an integer, \nfor example 5: ");
		numOfYears = input.nextInt();
		
		// Prompt User to enter the Annual Interest Rate
		System.out.print("Enter yearly interest rate, for example 8.25: ");
		annualInterestRate = input.nextDouble();
		
		// Calculate monthly interest Rate 
		double monthlyInterestRate = annualInterestRate / 1200;
			
		// Calculate the monthly payment
			double monthlyRepayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1+monthlyInterestRate), numOfYears*12)));
			
		// Create new variable
			double balance = loanAmount;
			double interest;
			double principal;
			
			
		// Print out loan information
			System.out.println("Loan Amount: " + loanAmount);
			System.out.println("Number of years: " + numOfYears);
			System.out.println("Interest rate: " + annualInterestRate + "%");
			System.out.println();
			
		// Print out monthly information
			System.out.println("Monthly Payment: " + (int) (monthlyRepayment * 100) / 100.0);
			
	}

}
