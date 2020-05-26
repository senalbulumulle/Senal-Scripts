import java.util.Scanner;



public class SentinelValue {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		
		// Read the first data and prompt the user to enter an integer
		System.out.print("Enter an integer (the input ends if it is 0): ");
		int data = input.nextInt();
		
		
		// Keep reading data until the input is 0
		// If the user doesn't put a 0 as a first digit, it will keep prompting the user to enter an integer.
		// If the user does put a 0 as a first digit it will stop prompting the user to enter another integer.
		int sum = 0;
		while (data != 0) {
			sum += data;
			
			
			// Read the next data and prompt the user to enter an integer
			System.out.print("Enter an integer (the input ends if it is 0): ");
			data = input.nextInt();
		}
		
		// If the user does put a 0 as a first digit it will stop prompting the user and will display the sum. 
		System.out.println("The Sum is: " + sum);
	}

}
