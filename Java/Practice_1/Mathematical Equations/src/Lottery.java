import java.util.Scanner;


public class Lottery {
	
	public static void main(String[] args) {
		// Generate a Lottery. 
		
		int lottery = (int)(Math.random() * 100);
		
		// Prompt user to guess a number. 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick(two digits): ");
		int guess = input.nextInt();
		
		// Get digits from lottery
		int lotteryDigit1 = lottery /10;
		int lotteryDigit2 = lottery % 10;
		
		// Get digits from user's guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		// Print User's Lottery. 
		System.out.println("The lottery number is " + lottery);
		
		// Check the guess
		
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");
		else 
			System.out.println("Sorry, no match");
		
		

	}

}