#include <stdio.h>

int main()

{
	// Make a title
	printf("\n\n\t\tSenal Programming Lesson\n\n\n");

	/* Int Variables */

	// Make int variables called n, sum, c, and remainder
	int n, sum = 0, c, remainder;



	// Prompt the user to enter the number of digits that they want to enter
	printf("Enter the number you want to add digits of: ");

	// Make a scanner object
	scanf("%d", &n);


	// Make a while loop
	while (n != 0)
	{
		remainder = n % 10;
		sum += remainder;
		n = n / 10;
	}


	// Print the sum of the digits of the entered number
	printf("\n\nSum of the digits of the entered number is = %d\n\n", sum);

	printf("\n\n\n\n\t\t\tSenal Bulumulle \n\n\n");

	// End the program 
}