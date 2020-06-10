import java.util.Scanner;


public class AreaOfTriangle {

	public static void main(String[] args) {
		// Make a Scanner Object
		Scanner input = new Scanner(System.in);

		// Make an Int Variable called Base
		int base = (int)(Math.random() * 10) + 1; 

		// Make an Int Variable called Height
		int height = (int)(Math.random() * 10) + 1;

		// Prompt the User the Question
		System.out.println("If the Base is " + base + ", and the height is " + height + ", what is the area ?");

		// Make an Int Variable called Area
		int area = input.nextInt();
		
		// If the User gets the right answer, it will say that it is correct. Followed by the "if" on Line 24.
		// If the User gets the wrong answer, it will say that it is incorrect. Followed by the "else" on Line 27.
		if (base * height * 0.5 == area)
			System.out.println("You are Correct");
		
		else{
			System.out.println("You are Incorrect");
		}




	}

}
