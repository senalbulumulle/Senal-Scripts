
public class TestMax {

	// Create another Method called Max
	public static int max(int num1, int num2) {
		// Create result variable
		int result;
		
		// Write a conditional statement that tells which number is greater. 
		if (num1 > num2)
			result = num1;
		else
			result = num2;
		
		return result;
	}
	
	public static void main(String[] args) {
		// Create two integer variables
		int i = 5;
		int j = 2;
		
		// Call the max method
		int k = max(i, j);
		
		// Print the result.
		System.out.println("The maximum of " + i + " and " + j + " is " + k);

	}

}
