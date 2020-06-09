import java.util.Scanner;


public class AreaQuiz {

	public static void main(String[] args) {
		
		// Create a variable called Length
		int length = (int)(Math.random() * 100) + 1;
		
		// Create a variable called Width
		int width = (int)(Math.random() * 100) + 1;
		
		System.out.println("If the length is " + length + " and the width is " + width + ", what is the area?");
		
		// Create a Scanner Object 
		Scanner input = new Scanner(System.in);
		
		// Create the area variable
		int area = input.nextInt();
		
		// Print out if the answer is right or wrong. 
		if (length * width == area)
			System.out.println("You are correct!");
		else {
			System.out.println("You are incorrect. The Area is: " + length * width);
		}
		

	}

}
