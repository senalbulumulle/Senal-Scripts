import java.util.Scanner;




public class SubtractionQuiz {

	public static void main(String[] args) {
		// Create a new Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Create a Variable for the first number 
		int num2 = (int)(Math.random() * 10);
		
		// Create a Variable for the second number
		int num1 = (int)(Math.random() * 10);
		
		// Print out the Question 
		System.out.print("What is " + num2 + " - " + num1 + " ? ");
		
		// Create a Variable for the answer 
		int answer = input.nextInt();
		
		// Print out the Answer
		if (num2 - num1 == answer)
			System.out.println("You are correct ");
		else {
			System.out.println("You are incorrect. The correct answer is " + (num2 - num1));
		}
	}

}
