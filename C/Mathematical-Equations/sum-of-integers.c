#include <stdio.h>

int main(int argc, char **argv)
{
	printf("\n\n\t\tSenal Programming Lesson - Best place to learn\n\n\n");
	
	// Make int variables called n, sum, c, and value
	int n, sum = 0, c, value;
	
	// Prompt the user to enter the number of integers you want to add
	printf("\n\nEnter the number of integers you want to add: ");
	
	// Make a scanner object 
	scanf("%d", &n);
	
	// Prompt the user to enter how many integers that they requested
	printf("Enter %d integers\n\n", n);
	
	// Make a for loop
	for(c = 1; c <= n; c++)
	{
		// Make a scanner object 
		scanf("%d", &value);
		
		// We need to initialize sum before using otherwise garbage value will get printed
		sum += value;
		
	}
	
	// Inform the user the printed numbers 
	printf("\n\n\nThe sum of the entered numbers = %d", sum);
	
	printf("\n\n\t\t\tSenal Bulumulle likes making things!\n\n\n");
	return 0;
}

