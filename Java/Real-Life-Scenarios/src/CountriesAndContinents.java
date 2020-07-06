import java.util.Scanner;



public class CountriesAndContinents {

	public static void main(String[] args) {
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a country name
		System.out.print("Enter a country name: ");
		
		// Make a Scanner String Variable called country
		String country = input.nextLine();
		
		// Make an if-else statement
		if (country.equals("United States") ||
				country.equals("Canada") ||
				country.equals("Mexico")) 
				System.out.println(country + " is in North America");
		else if (country.equals("Germany") ||
				country.equals("France") ||
				country.equals("Belgium") || 
				country.equals("United Kingdom") ||
				country.equals("Ireland") ||
				country.equals("Spain") ||
				country.equals("Portugal") ||
				country.equals("Italy") ||
				country.equals("Denmark") ||
				country.equals("Norway") ||
				country.equals("Poland") ||
				country.equals("Sweden") ||
				country.equals("Netherlands") ||
				country.equals("Greece"))
				System.out.println(country + " is in Europe");
		else if (country.equals("Afghanistan") ||
				country.equals("Azebaijan") ||
				country.equals("Azerbaijan") ||
				country.equals("Bahrain") ||
				country.equals("Bangladesh") ||
				country.equals("Bhutan") ||
				country.equals("Brunei") ||
				country.equals("Cambodia") ||
				country.equals("China") ||
				country.equals("Cyprus") ||
				country.equals("Georgia") ||
				country.equals("India") ||
				country.equals("Indonesia") ||
				country.equals("Iran") ||
				country.equals("Iraq") ||
				country.equals("Israel") ||
				country.equals("Japan") ||
				country.equals("Jordan") ||
				country.equals("Kazakhstan") ||
				country.equals("Kuwait") ||
				country.equals("Kyrgyzstan") ||
				country.equals("Laos") ||
				country.equals("Lebanon") ||
				country.equals("Malaysia") ||
				country.equals("Maldives") ||
				country.equals("Mongolia") ||
				country.equals("Myanmar") ||
				country.equals("Nepal") ||
				country.equals("North Korea") ||
				country.equals("Oman") ||
				country.equals("Pakistan") ||
				country.equals("Palestine") ||
				country.equals("Philippines") ||
				country.equals("Qatar") ||
				country.equals("Russia") ||
				country.equals("Saudi Arabia") ||
				country.equals("Singapore") ||
				country.equals("South Korea") ||
				country.equals("Sri Lanka") ||
				country.equals("Syria") ||
				country.equals("Taiwan") ||
				country.equals("Tajikistan") ||
				country.equals("Thailand") || 
				country.equals("Timor-Leste") ||
				country.equals("Turkey") ||
				country.equals("Turkmenistan") ||
				country.equals("United Arab Emirates") ||
				country.equals("Uzbekistan") ||
				country.equals("Vietnam") ||
				country.equals("Yemen"))
				System.out.println(country + " is in Asia");
		else if (country.equals("Argentina") ||
				country.equals("Bolvia") ||
				country.equals("Brazil") ||
				country.equals("Chile") ||
				country.equals("Colombia") ||
				country.equals("Ecuador") ||
				country.equals("Guyana") ||
				country.equals("Paraguay") ||
				country.equals("Peru") || 
				country.equals("Suriname") ||
				country.equals("Urugray") ||
				country.equals("Peru") ||
				country.equals("Suriname") ||
				country.equals("Urugray") ||
				country.equals("Venezuela"))
				System.out.println(country + " is in South America");
		else
			System.out.print("I don't know where " + country + " is. ");
		
		input.close();
	}
}