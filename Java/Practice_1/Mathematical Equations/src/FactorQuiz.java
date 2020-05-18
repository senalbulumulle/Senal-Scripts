import java.util.Scanner;

public class FactorQuiz {

	public static void main(String[] args) {
		// Generate Random Number 
		int number = (int)(Math.random() * 100);
		System.out.println(number);
		
		// Prompt user to enter an integer between 1 and 4 
		System.out.print("Enter an integer between 1 and 4: ");
		Scanner input = new Scanner (System.in);
		int factor = input.nextInt();
		
		// Show the result
		if (number % factor == 0)
		{
			System.out.println("The Value " + factor + " is a factor of " + number);
		}
		else
		{
			System.out.println("The value of " + factor + " is not a factor of " + number);
		}
		
	}

}
