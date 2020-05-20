import java.util.Scanner;


public class CalculateAge {

	public static void main(String[] args) {
		// Create a Scanner Object 
		Scanner input = new Scanner(System.in);
		
		// Prompt User to enter First Name 
		System.out.print("Enter your First Name: ");
		String firstName = input.nextLine();
		
		// Prompt user to enter Middle Name 
		System.out.print("Enter your Middle Name:");
		String middleName = input.nextLine();
		
		
		
		// Prompt User to enter Last Name 
		System.out.print("Enter your Last Name: ");
		String lastName = input.nextLine();
		
		// Prompt User to enter year of birth 
		System.out.print("Enter your year of birth: ");
		int year = input.nextInt();
		
		// Age variable to calculate the age based on the current year. 
		// For Example, current year (2020) minus the birth date year.
		int age = 2019-year;
		
		// Display the Results of the Current Age of User 
		System.out.print(firstName + ", you are " + age + " years old.");
		
		// yearsTillBirthday variable
		int yearsTillBirthday  = 62-age;
		
		// Displays the Results of the Years till the User's Birthday 
		System.out.print("There are " + yearsTillBirthday + " years until you are 62 years old. ");
		
		
		
		
	}

}
