import java.util.Scanner;



public class GuessBirthday {

	public static void main(String[] args) {
		
		// Make String Set 1
		String set1 = "1 3 5 7\n" + "9 11 13 15\n" + "17 19 21 23\n" + "25 27 29 31";
		
		// Make String Set 2
		String set2 = "2 3 6 7\n" + "10 11 14 15\n" + "18 19 22 23\n" + "26 27 30 31";
		
		// Make String Set 3
		String set3 = "4 5 6 7\n" + "12 13 14 15\n" + "20 21 22 23\n" + "28 29 30 31";
		
		// Make String Set 4
		String set4 = "8 9 10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 31";
		
		// Make String Set 5
		String set5 = "16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31";
		
		// Make an int variable "day" and assign the value of 0.
		int day = 0;
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to answer questions
		System.out.println("Is your birthday in Set1?\n");
		
		// Show user set 1 to view.
		System.out.print(set1);
		
		// Prompt user to answer yes or no.
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		
		// Create a Scanner Variable called "answer"
		int answer = input.nextInt();
		
		// Make an if-else statement for each string set.
		if (answer == 1)
			day += 1;
		
		// Prompt the user to answer questions
		System.out.print("\nIs your birthday in Set2? \n");
		
		// Show user set 2 to view.
		System.out.print(set2);
		
		// Prompt user to answer yes or no.
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		
		// Create a Scanner Variable called "answer"
		answer = input.nextInt();
		
		// Create an if-else statement for string set.
		if (answer == 1)
			day += 2;
		
		// Prompt the user to answer questions
		System.out.print("\nIs your birthday in Set3?\n");
		
		// Show user set 3 to view.
		System.out.print(set3);
		
		// Prompt user to answer yes or no.
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		
		// Create a Scanner Variable called "answer"
		answer = input.nextInt();
		
		// Create an if-else statement for string set
		if (answer == 1)
			day += 4;
		
		// Prompt the user to answer questions
		System.out.print("\nIs your birthday in Set4?\n");
		
		// Show user set 4 to view.
		System.out.print(set4);
		
		// Prompt the user to answer yes or no.
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		
		// Create a Scanner Variable called "answer"
		answer = input.nextInt();
		
		// Create an if-else statement for string set
		if (answer == 1)
			day += 8;
		
		// Prompt the user to answer questions
		System.out.print("\nIs your birthday in Set5?\n");
		
		// Show user set 5 to view
		System.out.print(set5);
		
		// Prompt user to answer yes or no.
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		
		// Create new Scanner Variable called "answer".
		answer = input.nextInt();
		
		// Create an if-else statement to ask if is their birthday.
		if (answer == 1)
			day += 16;
		System.out.println("\nYour birthday is " + day + "!");
	}

}
