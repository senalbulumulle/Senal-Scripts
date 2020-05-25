import java.util.Scanner;


public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		// Make an integer variable called number 1 and number 2 
		// to get Math.Random() to search for a random number to display. 
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		// Create a Scanner Object 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user a question to answer 
		System.out.print("What is " + number1 + " + " + number2 + " ? :");
		int answer = input.nextInt();
		
		//  If the user answers a problem wrong, it will give a message to the user that the answer 
		//  and it will prompt the user the problem again. 
		while (number1 + number2 != answer) {
			System.out.print("Wrong Answer. Try Again. What is " + number1 + " + " + number2 + " ? :");
			answer = input.nextInt();
		}
		
		// If the user answers a problem correctly, 
		// it will a message to the user that the answer is correct. 
		System.out.println("You got it!");
		
	}

}
