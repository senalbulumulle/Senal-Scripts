import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create two random numbers
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		
		// if number1 is less than number2 swap them
		if (number1 < number2)
		{
			int temp = number1;
			number1  = number2;
			number2  = temp;
			
		}
		
		// Prompt user to answer what is number 1 - number 2 
		System.out.print("What is " + number1 + " - " + number2 + " ? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if (number1 - number2 == answer)
		{
			System.out.println("You are correct!");
		}
		else 
		{
			System.out.println("Your answer is wrong. \n" + number1 + " - " + number2 + " should be " + (number1 - number2));
		}
	}

}
