import java.util.Scanner;


public class ComputeChange {

	public static void main(String[] args) {
		// Create Scanner = Allows user to import data. 
		Scanner input = new Scanner(System.in);
		
		// Receive the amount from user. 
		System.out.print("Enter an amount in double, for example 11.56:  ");
		// Create a variable for the amount 
		double amount = input.nextDouble();
		
		// Create a variable for the remaining amount
		int remainingAmount = (int)(amount * 100);
		
		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		// Find the amount of quarters 
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		// Find the amount of dimes
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		// Find the amount of nickels 
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		// Find the amount of pennies 
		int numberOfPennies = remainingAmount;
		
		// Display the Results 
		System.out.println("Your amount:  " + amount + "  consists of");
		System.out.println("    " + numberOfOneDollars + "  dollars");
		System.out.println("    " + numberOfQuarters + "  quarters");
		System.out.println("    " + numberOfDimes + "  dimes");
		System.out.println("    " + numberOfNickels + "  nickels");
		System.out.println("    " + numberOfPennies + "  pennies");
		
		


	}

}
