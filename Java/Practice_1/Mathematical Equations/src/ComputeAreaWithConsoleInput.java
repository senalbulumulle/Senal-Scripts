import java.util.Scanner;


public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Prompts User to enter a number for radius.
		
		System.out.print("Enter a number for radius: ");
		int radius = input.nextInt();
		
		// compute area of circle
		double area = radius * radius * 3.14;
		
		// display result
		System.out.println("The area for the circle of radius " + radius + " is " + area );
	}

}
