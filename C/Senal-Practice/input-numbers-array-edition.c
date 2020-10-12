#include <stdio.h>

int main()
{

	printf("\n\n\t\tSenal Programming Lesson - Best place to learn\n\n\n");

	// Make int variables 
	int n, sum = 0, c, array[100];

	// Prompt the user 
	printf("Enter the number of integers you want to add: ");

	// Make a Scanner Object 
	scanf("%d", &n);

	// Prompt the user to enter integers 
	printf("\n\nEnter %d integers \n\n", n);

	// Make a for loop
	for (c = 0; c < n; c++)
	{

		// Make a Scanner Object 
		scanf("%d", &array[c]);

		// Same as the "sum = sum + array[c]"
		sum += array[c];
	}

	// Inform the user the sum 
	printf("\n\nSum = %d\n\n", sum);

	printf("\n\n\t\t\tSenal Bulumulle likes making things!\n\n\n");

	// End the program 
	return 0;
}
