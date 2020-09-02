#include <stdio.h>

int main() {

	/* Int Variables */

	// Make an int variable called dividend
	int dividend;

	// Make an int variable called divisor
	int divisor;

	// Make an int variable called answer
	int answer;

	// Make an int variable called remainder
	int remainder;



	// Prompt the user to enter the dividend
	printf("Enter dividend: ");

	// Make a Scanner Object for dividend
	scanf("%d", &dividend);

	// Prompt the user to enter the divisor
	printf("Enter the divisor: ");

	
	// Make a Scanner Object 
	scanf("%d", &divisor);


	// Compute the answer
	answer = dividend / divisor;

	// Computes the remainder
	remainder = dividend % divisor;


	// Print out the answer
	printf("Quotient = %d\n", answer);

	// Print out the remainder
	printf("Remainder = %d", remainder);

	// End the program
	return 0;
}