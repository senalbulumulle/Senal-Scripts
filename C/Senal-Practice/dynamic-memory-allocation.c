#include <stdio.h>
#include <stdlib.h>
int main()
{

	printf("\n\n\t\tSenal Programming Language - Best place to learn\n\n\n");

	/* Int variables */
	int n, i, *ptr, sum = 0;


	// Prompt the user to enter the elements 
	printf("\n\nEnter number of elements: ");

	// Make a Scanner Object
	scanf("%d", &n);


	// Dynamic memory allocation using malloc()
	ptr = (int *) malloc(n * sizeof(int));

	// Make an if statement 

	// If empty array
	if(ptr == NULL)
	{
		printf("\n\nError! Memory not allocated\n");

		// End of program
		return 0;
	}

	// Prompt the user to enter the elements of an array
	printf("\n\nEnter the elements of an array: \n\n");

	// Make a for loop
	for(i = 0; i < n; i++)
	{

		// Ptr [i] is same as *(ptr + i)
		printf("%d ", ptr[i]);
	}


	// Freeing memory of ptr allocated by malloc
	// using the free() method

	free(ptr);

	printf("\n\n\t\t\tSenal Bulumulle likes making things !\n\n\n");

	// End the program 
	return 0;
}
