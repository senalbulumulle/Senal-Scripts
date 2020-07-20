import java.util.Scanner;

public class ReactFAST {

	public static void main(String[] args) throws InterruptedException {
		
		// Print the countdown, "3"
		System.out.println("3");
		
		// Add a Sleep or Pause Declaration for 1 second
		Thread.sleep(1000);
		
		// Print the countdown "2"
		System.out.println("2");
		
		// Add a Sleep or Pause Declaration for 1 second 
		Thread.sleep(1000);
		
		// Print the countdown "1"
		System.out.println("1");
		
		
		// Add a Sleep or Pause Declaration for 1 second 
		Thread.sleep(1000);
		
		// Print "Go"
		System.out.println("Type any Key, GO!!");
		
		// Get the current time
		long startTime = System.currentTimeMillis();
		
		// Make a Scanner Object
		Scanner s = new Scanner(System.in);
		
		// Make a  String Variable called "a",
		// to pass the "s" scanner variable, so the user can enter something next.
		s.next();
		
		// Get the current time
		long stopTime = System.currentTimeMillis();
		
		// Get the reaction time
		long reactionTime = stopTime - startTime;
		
		// Print out the reaction time
		System.out.println("Your Reaction Time is: " + reactionTime + " ms");

	}

}
