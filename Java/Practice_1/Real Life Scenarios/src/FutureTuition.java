
public class FutureTuition {

	public static void main(String[] args) {
		// Create Variable for tuition per year.
		double tuition = 10000; 
		
		// Create Variable for the year. Start with Zero.
		int year = 0;
		
		// Create a while loop that shows tuition per year. 
		while (tuition < 20000) {
			tuition = tuition * 1.07;
			year++;
		}
		
		// Print when tuition will be doubled.
		System.out.println("Tuition will be doubled in " + year + " years");
		
		// Print if tuition is not doubled.
		System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
	}

}
