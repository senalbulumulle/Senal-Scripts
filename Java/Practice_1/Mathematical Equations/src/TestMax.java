
public class TestMax {

	// Define and declare a new method to find the maximum value of two numbers 
	public static int max(int num1, int num2) {
		
		// Define an int variable called result
		int result;
		
		// Make conditional statement comparing num1 and num2
		if (num1 > num2)
			result = num1;
		else
			result = num2;
		
		// Return the answer 
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		
		// Create two number variables
		int i = 5;
		int j = 2;
		
		// Make a new variable "k" that calls the max method 
		int k = max(i,j);
		
		// Display the result
		System.out.println("The maximum of " + i + " and " + j + " is " + k);

	}

}
