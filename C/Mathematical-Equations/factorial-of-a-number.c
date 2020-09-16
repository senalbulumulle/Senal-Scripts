#include <stdio.h>
#include <conio.h>


int main(void)
{

	/* Int variables */

	// Make an int variable called fact
	int fact;

	// Make an int variable called i
	int i;

	// Make an int variable called n
	int n;

	fact = 1;

	// Prompt the user to enter the number
	printf("Enter the number:\t");

	// Make a scanner object
	scanf("%d", &n);

	for (i = 1; i <= n; i++)
	{
		fact = fact * i;
	}

	// Print the results
	printf("Factorial of %d is %d", n, fact);

	// End the program
	return 0;
}