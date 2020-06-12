import java.util.Scanner;



public class FIndCircumference {

	public static void main(String[] args) {
		
		// Make a new variable that generates the radius
		int radius = (int)(Math.random() * 10);
		
		// Prompt the User a Question. 
		System.out.print("The radius of a circle is " + radius + ". What is the circumference?");
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Make a new variable that outputs the circumference
		double circumference = input.nextDouble();
		
		// Prompt the User the Score
		if (((3.14 * 2) * radius) == circumference) 
		{
			System.out.println("You got the correct answer");
		}
			else 
			{
				System.out.println("You got the incorrect answer");
			}
	}

}
