import java.util.Scanner;



public class SubtractionQuiz {

	public static void main(String[] args) {
		
		// Create a new Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Make an int variable for num2
		int num2 = (int)(Math.random() * 10);
		
		// Make an int variable for num1
		int num1 = (int)(Math.random() * 10);
		
		// Print the user the question
		System.out.print("What is " + num2 + " - " + num1 + " = ");
		
		// Make a Scanner int variable for answer
		int answer = input.nextInt();
		
		// Make a if-else statement to indicate a user if the answer is right or wrong for num2 or num1
		if (num2 - num1 == answer)
			System.out.println("Your answer is correct");
		else
			System.out.println("Your answer is incorrect");

	}

}
