
public class MultiplicationTable {

	public static void main(String[] args) {
		
		// Create a final int for all the rows
		final int TOTAL_ROWS = 15;
		
		// Create a final int for all the columns
		final int TOTAL_COLUMNS = TOTAL_ROWS;
		
		// Make the table header
		System.out.print("        ");
		for (int col = 0; col < TOTAL_COLUMNS; col ++)
		{
			System.out.printf("%5d", col);
		}
		
		// Print out column headers
		System.out.println("\n ------------------------------------------------------------------------------------");
		
		// Make a for-loop for all the rows in the table
		for (int row = 0; row < TOTAL_ROWS; row ++)
		{
			
			// Print out row headers
			System.out.printf("%5d | ", row);
		
		
			// Make a for-loop to draw all the column values in the row.
			for (int col = 0; col < TOTAL_COLUMNS; col ++)
			{
				System.out.printf("%5d" , row *  col);
			}
			
			// Do a \n to go to the end of each row.
			System.out.println("");

	}
		// Print out column headers
		System.out.println("------------------------------------------------------------------------------------");

}
}