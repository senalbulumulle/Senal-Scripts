import java.util.Scanner;



public class GuessNumberGame {

	public static void main(String[] args) {
		
		// Generate a random number to be guessed.
		int number = (int)(Math.random() * 101);
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a two-digit number
		System.out.println("Enter a two-digit number as your guess");
		
		// Make a guess variable
		int guess = -1;
		
		// Create a while loop until the user guesses the right number
		while(guess != number) {
			// Prompt the user to enter their guess
			System.out.print("Enter your Guess: ");
			
			// Create a Scanner Guess Variable
			guess = input.nextInt();
			
		
		
		// Create an if-else statement that tells the user if their guess is too high or too low
		if (guess == number)
			System.out.println("Yes, the number is " + number);
		else if (guess > number)
			System.out.println("Your guess is too high");
		else
			System.out.println("Your guess is too low");

	}

}
	
}
