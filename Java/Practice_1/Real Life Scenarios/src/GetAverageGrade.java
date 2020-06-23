import java.util.Scanner;



public class GetAverageGrade {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt User to enter first grade
		System.out.print("Enter the first grade as a percentage: ");
		
		// Make Scanner variable for grade 1 
		int grade1 = input.nextInt();
		
		// Prompt User to enter second grade
		System.out.print("Enter the second grade as a percentage: ");
		
		// Make Scanner variable for grade 2
		int grade2 = input.nextInt();
		
		// Prompt User to enter third grade
		System.out.print("Enter the third grade as a percentage: ");
		
		// Make Scanner variable for grade 3 
		int grade3 = input.nextInt();
		
		// Prompt User to enter fourth grade
		System.out.print("Enter the fourth grade as a percentage: ");
		
		// Make Scanner variable for grade 4
		int grade4 = input.nextInt();
		
		// Prompt User to enter fifth grade
		System.out.print("Enter the fifth grade as a percentage: ");
		
		// Make Scanner variable for grade 5 
		int grade5 = input.nextInt();
		
		
		// Find and create an average variable 
		int average = ((grade1 + grade2 + grade3 + grade4 + grade5) / 5);
		
		// Prompt user the average 
		System.out.println("The average is: " + average);
		
		
	}

}
