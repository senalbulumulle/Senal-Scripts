#include <stdio.h>

int main() {

	/* Int Variables */

	// Make a int variable called factor1
	int factor1;

	// Make a int variable called factor2
	int factor2;

	// Make a int variable called product
	int product;



	// Prompt the user to enter the factor1
	printf("Enter the first factor: ");

	// Make a Scanner Object for factor1
	scanf("%d", &factor1);

	// Prompt the user to enter the factor2
	printf("Enter the second factor: ");

	// Make a Scanner Object for factor2
	scanf("%d", &factor2);



	// Computes Product
	product = factor1 * factor2;

	// Print the product 
	printf("Product = %d\n", product);

	// End the Program
	return 0;
}