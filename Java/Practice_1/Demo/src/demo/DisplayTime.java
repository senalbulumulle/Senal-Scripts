package demo;
import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompts the User to enter something in 
		
		System.out.print("Enter the amount of seconds: ");
		
		int seconds  = input.nextInt();
		
		int minutes = seconds / 60; // Find minutes in seconds
		
		int remainingSeconds = seconds % 60; // Seconds Remaining
		
		System.out.println(seconds + " seconds is " +  minutes + " minutes and  " + remainingSeconds + " seconds");


	}

}
