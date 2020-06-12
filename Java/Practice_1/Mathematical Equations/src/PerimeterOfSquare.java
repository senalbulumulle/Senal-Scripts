import java.util.Scanner;

public class PerimeterOfSquare {

	public static void main(String[] args) {
		
		// Make a new variable for the length.
		int length = (int)(Math.random() * 10);
		
		// Prompt the user with a question. 
		System.out.println("What is the Perimeter of a Square. If the Length of 1 side is " + length + "?");
		
		// Create a Scanner Object 
		Scanner input = new Scanner(System.in);
		
		// Make a new variable for the perimeter.
		int perimeter = input.nextInt();
		
		// Score the User's answer. 
		if (length * 4 == perimeter) 
		{ 
			System.out.println("You are correct");
		}
			
		else 
		{
			System.out.println("You are incorrect");
		}
	}

}
