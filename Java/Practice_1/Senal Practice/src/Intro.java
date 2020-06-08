import java.util.Scanner;




public class Intro {

	public static void main(String[] args) {

		// Create a new Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompt the User to enter their name. For Example, Senal Bulumulle.
		System.out.print("Enter your Name: ");

		// Create a String Variable called Name.
		String name = input.nextLine();

		// Prompt the User to enter their age. 
		System.out.print("Enter your Age: ");

		// Create a String Variable called age.
		String age = input.nextLine();

		// Prints out the User's Information.
		System.out.println("Here is your information ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

}
