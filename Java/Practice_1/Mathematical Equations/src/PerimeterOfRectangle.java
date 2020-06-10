import java.util.Scanner;


public class PerimeterOfRectangle {

	public static void main(String[] args) {
		
		// Make an int variable called length
		int length = (int)(Math.random() * 10);
		
		// Make an int variable called width
		int width = (int)(Math.random() * 10);
		
		// Prompt user a question to answer to the perimeter. 
		System.out.println("What is the Perimeter of a Rectangle, if the length is " + length + ", and the width is " + width + "?");
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Make int variable called perimeter
		int perimeter = input.nextInt();
		
		// Prompt the User the Score
		if ((2 * length) + (2 * width) == perimeter)
			System.out.println("You are correct");
		else {
			System.out.println("You are incorrect");
		}
	}

}
