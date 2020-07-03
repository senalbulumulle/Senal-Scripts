import java.util.Scanner;



public class ComputeAverage {

	public static void main(String[] args) {
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt the User to enter 4 percentages
		System.out.print("Enter 4 Grades (In Percentages) : ");
		
		// Enter 4 Scanner int variables 
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		int number4 = input.nextInt();
		
		// Make an int variable called average.
		int average = (number1 + number2 + number3 + number4) / 4;
		
		// Display the result
		System.out.println("The average is " + average);
		
		// Make an if-statement to see if the average is pass or fail
		if (average > 70)
			System.out.println("You passed");
		else 
			System.out.println("You failed");
	}

}
