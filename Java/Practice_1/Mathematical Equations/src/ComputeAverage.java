import java.util.Scanner;


public class ComputeAverage {

	public static void main(String[] args) {
		// Create a Scanner Variable 
		Scanner input = new Scanner(System.in);
		
		// Prompt User to enter 3 numbers 
		System.out.print("Enter three numbers: ");
		
		// Create 3 different variables 
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// Compute average 
		int average = (number1 + number2 + number3) / 3;
		
		// Display Result
		System.out.println("Average of " + number1 + " ,  " + number2 + " ,  " + number3 + " is " + average);
	}

}
