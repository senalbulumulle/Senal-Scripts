import java.util.HashMap;
import java.util.Scanner;

public class UserNameGenerator {

	public static void main(String[] args) {
		
		// Prompt the user to enter the first letter of your first name and the day you were born 
		System.out.println("Enter the first letter of your name and \n" + "the day of the month you were born: ");
		
		// Make a Scanner Object
		Scanner scan = new Scanner(System.in);
		
		// Create a Scanner Variable for the first letter of the first name
		String letter = scan.next().toUpperCase();
		
		// Create a integer scanner variable for the day they were born 
		int day = scan.nextInt();
		
		// Make a HashMap Variable called letters
		HashMap<String, String> letters = new HashMap<String, String>();
		
		// Make an alphabetical list of letters 
		letters.put("A", "Captain");
		letters.put("B", "Lavish");
		letters.put("C", "Shiny Bot");
		letters.put("D", "High Note");
		letters.put("E", "Pretty");
		letters.put("F", "Divine");
		letters.put("G", "Beautiful");
		letters.put("H", "Handy");
		letters.put("I", "Intelligent");
		letters.put("J", "Smile");
		letters.put("K", "Krazy");
		letters.put("L", "Loving");
		letters.put("M", "Royal");
		letters.put("N", "Nice");
		letters.put("O", "Optimistic");
		letters.put("P", "Proud");
		letters.put("Q", "Masterful");
		letters.put("R", "Honorable");
		letters.put("S", "Justice");
		letters.put("T", "Trusting");
		letters.put("U", "Fabulous");
		letters.put("V", "Kind");
		letters.put("W", "Wonderful");
		letters.put("X", "Saving");
		letters.put("Y", "Thoughtful");
		letters.put("Z", "Brilliant");
		
		// Make a HashMap Variable called days
		HashMap<Integer, String> days = new HashMap<Integer, String>();
		
		// List the days of the month
		days.put(1, "Sour");
		days.put(2, "Great");
		days.put(3, "Old");
		days.put(4, "Loud");
		days.put(5, "Little");
		days.put(6, "Epic");
		days.put(7, "Wet");
		days.put(8, "Dank");
		days.put(9, "Fake");
		days.put(10, "Sentle");
		days.put(11, "Musty");
		days.put(12, "Sharp");
		days.put(13, "Dangerous");
		days.put(14, "Monotone");
		days.put(15, "Squeaky");
		days.put(16, "Noiseless");
		days.put(17, "Rotten");
		days.put(18, "Fat");
		days.put(19, "Soft");
		days.put(20, "Potent");
		days.put(21, "Sudden");
		days.put(22, "Powerful");
		days.put(23, "Strange");
		days.put(24, "Sturdy");
		days.put(25, "Flat");
		days.put(26, "Full");
		days.put(27, "Windy");
		days.put(28, "Horrid");
		days.put(29, "Beautiful");
		days.put(30, "Hot");
		days.put(31, "Slient");
		
		// Print out the generated user name.
		System.out.println("Your User Name is " + letters.get(letter) + " " + days.get(day));

	}

}
