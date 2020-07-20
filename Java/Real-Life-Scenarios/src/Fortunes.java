import java.util.Random;
import java.util.Scanner;




public class Fortunes {

	// Create a Single Dimensional Array called Fortunes
	static String[] fortunes = {"As I see it, yes.", 
			"Ask again later",
			"Better not tell you now.",
			"Cannot predict now.",
			"Concentrate and ask again",
			"Don't count on it",
			"It is certain.",
			"It is decidedly so.",
			"Most Likely",
			"My reply is no",
			"My sources say no",
			"Outlook not so good",
			"Outlook good",
			"Reply hazy, try again",
			"Signs point to yes",
			"Very doubtful",
			"Without a doubt",
			"Yes",
			"Yes-definitely",
			"You may rely on it"};
	
	
	public static void main(String[] args) {
		
		// Prompt the user to ask the cpu the question
		System.out.println("Ask the CPU a yes or no question.");
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get User to input a string. 
		String answer = input.next();
		
		// Create a new random variable 
		Random rand = new Random();
		
		// Generate Random Item in the array.
		int r = rand.nextInt(fortunes.length);
		
		// Print out a random answer
		System.out.println(fortunes[r]);
	}

	
}
