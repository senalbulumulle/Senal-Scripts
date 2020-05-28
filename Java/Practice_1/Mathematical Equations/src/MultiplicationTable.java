
public class MultiplicationTable {

	public static void main(String[] args) {
		// Display the table heading
		System.out.println("      Multiplication Table");
		
		// Display the number title
		System.out.print("   ");
		
		// Create a for loop to repeat 9 times for the first line. 
		for (int j = 1; j <= 9; j++)
			System.out.print("  " + j);
		
		System.out.println("\n-------------------------------------------------------------------");
		
		// Print the inside of the table
		for	(int i = 1; i <= 9; i++) {
			System.out.print(i + " | ");
			for (int j = 1; j <= 9; j++) {
				// Display the product and align properly
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}

	}

}
