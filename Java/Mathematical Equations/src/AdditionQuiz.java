import java.util.Scanner;


public class AdditionQuiz {

	public static void main(String[] args) {
		
		// Create an integer for how many questions
		final int NUMBER_OF_QUESTIONS = 20;
		
		// Create a Variable for how many correct answers
		int correctCount = 0;
		int count = 0;
		
		// Create a new variable to tell the user to tell how much time it took them to take the quiz
		long startTime = System.currentTimeMillis();
		
		// Create a while loop for the quiz
		while (count < NUMBER_OF_QUESTIONS) {
			
		
		
		// Create a new Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Create two random variables
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		// Prompt the user to answer the Equation
		System.out.print("What is " + number1 + " + " +  number2 + " ? ");
		
		// Create a Scanner Variable answer
		int answer = input.nextInt();
		
		// Create if else to display result
		if (number1 + number2 == answer)
			System.out.println("You are correct");
		else { 
			System.out.println("Your Answer is incorrect");
		}
count++;
 
	}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime/1000 + " seconds\n");

}

}