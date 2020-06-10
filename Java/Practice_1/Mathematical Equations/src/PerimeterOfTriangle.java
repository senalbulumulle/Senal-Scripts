import java.util.Scanner;


public class PerimeterOfTriangle {

	public static void main(String[] args) {
		
		// Make an int variable called Side 1
		int side1 = (int)(Math.random() * 10);
		
		// Make an int variable called Side 2 
		int side2 = (int)(Math.random() * 10);
		
		// Make an int variable called Side 3
		int side3 = (int)(Math.random() * 10);
		
		// Prompt the User a question to answer the perimeter of the triangle
		System.out.println("What is the perimeter of a triangle? If Side 1 is " + side1 + ", Side 2 is " + side2 + ", and Side 3 is " + side3 + ". What is the Perimeter? ");
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		
		// Make an int variable called perimeter
		int perimeter = input.nextInt();
		
		
		// Print user the score 
		if (side1 + side2 + side3 == perimeter)
			System.out.println("You are correct");
		else {
			System.out.println("You are incorrect");
		}
	}

}
