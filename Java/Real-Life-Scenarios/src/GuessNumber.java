import java.util.Scanner;


public class GuessNumber {

	public static void main(String[] args) {
		
		// Make a int variable called number
		int number = (int)(Math.random() * 10);
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to guess the magic number from 0 to 100
		System.out.println("Guess a magic number between 0 and 100");
		
		// Make an int variable called guess
		int guess = -1;
		
		// Make a while loop for guess
		while(guess != number) {
			// Prompt the user to guess the number
			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();
			
			// Make an if-else statement for guess
			if (guess == number)
				System.out.println("Yes, the number is " + number);
			else if (guess > number)
				System.out.println("Yes, the number is " + number);
			else
				System.out.println("Your guess is too low");
		}

	}

}
