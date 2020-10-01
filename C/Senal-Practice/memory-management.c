#include <stdio.h>
#include <stdlib.h>
int main()
{

	printf("\n\n\t\tSenal Programming Language- Best place to learn\n\n\n");

	// Make int variables 
	int n, i, *ptr, sum = 0;

	// Prompt the user to enter the number of elements 
	printf("\n\nEnter the number of elements: ");

	// Make a scanner object
	scanf("%d", &n);

	// Dynamic memory allocation using malloc()
	ptr = (int *)malloc(n * sizeof(int));


	// Make an if statement

	// If empty array 
	if(ptr == NULL)
	{

		printf("\n\nError! Memory not allocated\n");		
		return 0;
	}


	// Prompt the user to enter the elements of an array
	printf("\n\nEnter elements of array: \n\n");

	// Make a for loop
	for(i = 0; i < n; i++)
	{

		// Storing elements at contigous memory locations
		scanf("%d", ptr+i);
		sum = sum + *(ptr + i);
	}

	// Printing the array elements using pointer to the location
	printf("\n\nThe elements of the array are: ");

	// Make a for loop
	for(i = 0; i < n; i++)
	{

		// ptr[i] is same as *(ptr + i)
		printf("%d ",ptr[i]);
	}

	// Freezing memory of ptr allocated by malloc
	// using the free() method

	free(ptr);

	printf("\n\n\t\t\tSenal likes making things!");
}
