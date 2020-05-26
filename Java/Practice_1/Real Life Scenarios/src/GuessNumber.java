import java.util.Scanner;


public class GuessNumber {

	public static void main(String[] args) {
		// Create a Random Number
		int number = (int) (Math.random() * 101);
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Print out welcome and user directions. 
		System.out.println("Welcome to Guess a Number. Please guess a number from 0 to 100.");
		
		// Create a Default Answer 
		int guess = -1;
		
		// Create a While loop as long as the answer is wrong. 
		while (guess != number) {
			System.out.print("\nEnter your guess:  ");
			guess = input.nextInt();
			
			if (guess == number)
				System.out.println("Yes, the number is " + number);
			else if (guess > number)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");
		}

	}

}
