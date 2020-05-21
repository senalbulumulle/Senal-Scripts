import java.util.Scanner;


public class CalculateBucketFillUpTime {

	public static void main(String[] args) {
		// Create a Scanner Object.
		Scanner input = new Scanner(System.in);
		
		// Prompt User to enter the size of the bucket in gallons 
		System.out.print("Enter the amount of bucket holds: ");
		int size = input.nextInt();
		
		// Prompt User to enter the Flow Rate 
		System.out.print("Enter the Flow Rate: ");
		int flowRate = input.nextInt();
		
		// Calculate the amount of time the bucket takes to fill up. 
		int time = size / flowRate;
		
		// Display the answer
		System.out.print("The Bucket will be filled in the following amount of minutes: " + time);
		
		

	}

}
