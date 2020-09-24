#include <stdio.h>
#include <ncurses.h>

int main()
{
	/* Int variables */
	int fact, i, n;

	fact = 1;

	// Prompt the user to enter the number 
	printf("Enter the number\t");

	// Make a scanner object
	scanf("%d", &n);

	// Make a for loop
	for(i = 1; i <= n; i++)
	{
		fact = fact * i;
	}

	// Print out the factor
	printf("Factorial of %d is %d", n, fact);

	// 
	getch();

	// End the program
	return 0;
}
