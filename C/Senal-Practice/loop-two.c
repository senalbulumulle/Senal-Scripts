#include <stdio.h>

int main()
{

	// Make integer variables 
	int number, count, sum = 0;

	// Prompt user to enter a positive integer
	printf("Enter a positive integer: ");

	// Make a Scanner Object
	scanf("%d", &number);

	// Make a for-loop
	for(count = 1; count <= number; ++count)
	{
		sum += count;
	}

	// Print the sum
	printf("Sum = %d", sum);

	// End the program
	return 0;
}