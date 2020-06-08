import java.util.Scanner;




public class AdditionQuiz {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input =  new Scanner(System.in);
		
		// Create a Variable for the first number
		int num1 = (int)(Math.random() * 10);
		
		// Create a Variable for the second number
		int num2 = (int)(Math.random() * 10);
		
		// Print the first addition question
		System.out.print("What is " +  num1 +  " + " + num2 + " ? ");
		
		// Create a Variable for the Answer
		int answer = input.nextInt();
		
		
		// Print if the answer is correct or not. 
		if (num1 + num2 == answer)
				System.out.println("You are Correct");
		else {
			System.out.println("You are incorrect. The correct answer is " + (num1 + num2));
		}
	}

}
