public class FindingAverage {

	public static void main(final String[] args) {
		
		// Input the Scanner
		final java.util.Scanner input = new java.util.Scanner(System.in);
		
		// Prompt User to enter the number of items
		System.out.print("Enter the number of items:");
		final int n = input.nextInt();

		// Create an array 
		final double[] numbers = new double [n]; 
		double sum = 0;

		// Prompt User to enter the numbers 
		System.out.print("Enter the numbers: ");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		final double average = sum / n;

		// The numbers of elements above average
		int count = 0;
		for (int i = 0; i < n; i++)

			// Count if number[i] > average
		   if (numbers[i] > average)
		   count++;

		// Print out the average 
		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average is " + count);
				



	}

}
