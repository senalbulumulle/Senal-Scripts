import java.util.Scanner;

public class SubtractionQuizLoop {

	public static void main(String[] args) {
		// Number of Questions.
		final int NUMBER_OF_QUESTIONS = 10; 
		
		// Count the number of correct answers.
		int correctCount = 0;
		
		// Count the number of questions.
		int count = 0;
		long startTime = System.currentTimeMillis();
		
		// Output string is initially empty.
		String output = ""; 
		
		
		// Create a Scanner Object.
		Scanner input = new Scanner(System.in);
		
		
		// Generate two random single-digit integers.
		while (count < NUMBER_OF_QUESTIONS) {
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);
		
		
		
		// If number1 < number2, swap number1 with number2.
		if (number1 < number2) {
			int temp  = number1;
			number1 = number2;
			number2 = temp;
		}
		
		
		// Prompt the student to answer the question.
		System.out.print("What is " + number1 + " - " + number2 + "? ");
		
		
		// Make an integer variable called "answer" to find the answer. 
		int answer = input.nextInt();
		
		
		// Grade the answer and display the result.
		// If user answer is correct, it will display the user that the answer is correct.
		// If the user answer is incorrect, it will display the user that the answer is incorrect
		// and it will show the correct answer that the user should of answered. 
		if (number1 - number2 == answer) {
			System.out.println("You are correct!\n");
			correctCount++;
		}
		else
			System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2) + "\n");
		
		
		// Increase the count 
		count++;
		
		output += "\n" + number1 + "-" + number2 + "=" + answer + ((number1 - number2 == answer) ? " correct" : " wrong");	
	}
	
	long endTime =  System.currentTimeMillis();
	long testTime = endTime - startTime;
	
	System.out.println("Correct count is " + correctCount + "\nTest Time is: " + testTime / 1000 + " seconds\n " + output);
	
}
}
