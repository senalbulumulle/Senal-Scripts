#include <stdio.h>

int main()
{

	printf("\n\n\t\tSenal Programming Lesson -Best place to learn\n\n\n");

	/* Int Variables */

	int n, sum = 0, c, array[100];


	// Prompt the user to enter the integers that they want to add
	printf("Enter the number of integers you want to add: ");

	// Make a scanner object
	scanf("%d", &n);


	// Prompt the user to enter the integers
	printf("\n\nEnter %d integers \n\n", n);


	/* For loop */

	// Make a for loop
	for (c = 0; c < n; c++)
	{

		// Make a scanner object
		scanf("%d", &array[c]);

		// Same as "sum = sum + array[c]"
		sum += array[c];
	}

	// Print the sum
	printf("\n\nSum = %d\n\n", sum);

	printf("\n\n\t\tSenal Bulumulle likes making things!\n\n\n");

	// End the program
	return 0;
}