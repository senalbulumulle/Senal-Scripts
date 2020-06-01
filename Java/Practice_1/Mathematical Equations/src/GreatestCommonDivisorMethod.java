import java.util.Scanner;


/** Main Method */
public class GreatestCommonDivisorMethod {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		// Prints out the Greatest Common Divisor Answer
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
		
	}	
		
// Return the gcd of two integers 
public static int gcd(int n1, int n2) {
	// Initial gcd is 1 
	int gcd = 1;
	
	// Possible gcd 
	int k = 1;
	
	// Make a while loop so the gcd is always updated. 
	while (k <= n1 && k <= n2) {
		if (n1 % k == 0 && n2 % k == 0)
			// update gcd
			gcd = k; 
		k++;
		
	}
	// Returns gcd
	return gcd;
}
		
	}


