import java.util.Scanner;

public class OrderTwoCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Prompts the User to enter two cities 
		System.out.print("Enter the first city: ");
		
		// Make a string variable called city1 for user to enter the first city
		String city1 = input.nextLine();
		
		// Prompt the User to enter the Second City 
		System.out.print("Enter the second city: ");
		
		// Make a string variable called city2 for user to enter the second city
		String city2 = input.nextLine();
		
		if (city1.compareTo(city2) < 0 )
			System.out.println("The cities in alphabetical order are:  " + city1 + " " + city2);
		
		else
			System.out.println("The cities in alphabetical order are: " + city2 + " " + city1);
		
	}

}
