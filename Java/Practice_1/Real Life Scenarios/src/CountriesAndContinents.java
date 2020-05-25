import java.util.Scanner;

public class CountriesAndContinents {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner (System.in);

		// Prompt User to enter a country
		System.out.print("Enter country name: ");
		String country = input.nextLine();

		// Sort countries into continents. 

		if (country.equals("United States") || 
					country.equals("Canada")||
					country.equals("Mexico"))
					System.out.print(country + " is in North America");
		else if (country.equals("Brazil") || 
					country.equals("Colombia") ||
					country.equals("Peru")  ||
					country.equals("Chile") ||
					country.equals("Argentina")) 
				System.out.print(country + " is in South America");
		else if (country.equals("Europe") ||
					country.equals("Germany") ||
					country.equals("England") ||
					country.equals("Italy") ||
					country.equals("France") ||
					country.equals("Greece") ||
					country.equals("Norway") ||
					country.equals("Spain") ||
					country.equals("Belgium") ||
					country.equals("Switzerland"))
				System.out.print(country + " is in Europe");
		else if (country.equals("Egypt") ||
					country.equals("South Africa") ||
					country.equals("Nigeria") ||
					country.equals("Ethopia") ||
					country.equals("Libya") ||
					country.equals("Madagascar") ||
					country.equals("Morocco") ||
					country.equals("Angola") ||
					country.equals("Kenya")) 
				System.out.print(country + " is in Africa");
		else if (country.equals("China") ||
					country.equals("India") ||
					country.equals("Japan") ||
					country.equals("Sri Lanka") ||
					country.equals("South Korea") ||
					country.equals("North Korea") ||
					country.equals("Thailand") ||
					country.equals("Vietnam") ||
					country.equals("Cambodia")||
					country.equals("Nepal") ||
					country.equals("Saudi Arabia") ||
					country.equals("Bangladesh") ||
					country.equals("Maldives") ||
					country.equals("Afghanistan") || 
					country.equals("Iraq") ||
					country.equals("Syria") ||
					country.equals("United Arab Emirates") ||
					country.equals("Armenia"))
				System.out.print(country + " is in Asia");
		else 
				System.out.print("I don't know where " + country + " is. " );

		input.close();


	}

}
