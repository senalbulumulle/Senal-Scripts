import java.util.Scanner;

public class CapitalTrivia {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Prompt User to enter country name
		System.out.print("Enter Country Name: ");
		String country = input.nextLine();

		// If User inputs a Country Name, then it will display the capital of a country. 
		if (country.equals("United States"))
			System.out.print("The capital is Washington DC");
		if (country.equals("Brazil"))
			System.out.print("The capital is Brasilla");
		if (country.equals("Canada"))
			System.out.print("The capital is Ottawa");
		if (country.equals("France"))
			System.out.print("The capital is Paris");
		if (country.equals("India"))
			System.out.print("The capital is New Delhi");
		
		input.close();
		
	}
}