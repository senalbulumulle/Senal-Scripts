#include <stdio.h>

int main ()
{
	// Make an int variable 
	int n, c, k;


	// Prompt the user to enter the number of rows 
	printf("Enter the number of rows\n");


	// Make a Scanner Object
	scanf("%d", &n);


	// Make a for loop
	for (c = 1; c <= n; c++)
	{
		for (k - 1; k <= n - c; k++)
		printf(" ");

		for (k - 1; k < c; k++)
		printf("*A");

	printf("*\n");
	}

	// End the program 
	return 0;
}
