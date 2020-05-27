public class TestSum {

	public static void main(String[] args) {
		// Create a floating data point called sum.
		double  sum = 0;
		double currentValue = 1.0;
		
		for (int count=0; count <100; count++) {
			sum += currentValue;
			currentValue -= 0.01;
		}
		
		
		// Print out the loop
		System.out.println("The sum is " + sum);
		
	}

}