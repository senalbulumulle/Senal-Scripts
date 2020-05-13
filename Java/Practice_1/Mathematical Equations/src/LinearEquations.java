import java.util.Scanner;

public class LinearEquations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter value for x 
		System.out.print("Enter a value for x: ");
		int x = input.nextInt();
	
		// Make a blank line.
		System.out.println();
		
		// Prompt user to enter a value for y 
		System.out.print("Enter a value for y: ");
		int y  = input.nextInt();
		
		//Make a blank line
		System.out.println();
		
		// compute the answer
		int answer = ((x * x) + (x * y ) + (y * y));
		
		// Display the Result 
		System.out.println("The answer to xx + xy yy is " + answer);

	}

}
