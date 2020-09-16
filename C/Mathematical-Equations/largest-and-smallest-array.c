#include <stdio.h>

int main()
{

	printf("\n\n\t\tSenal Programming Lesson -Best Place to learn\n\n\n");

	/* Int variables */

	int a[50], size, i, big, small;


	// Prompt the user to enter the size of the array
	printf("\nEnter the size of the array: ");

	// Make a scanner object
	scanf("%d", &size);


	// Prompt the user to enter the elements of the array 
	printf("\n\nEnter the %d elements of the array: \n\n", size);

	// Make a for loop
	for (i = 0; i < size; i++)

	// Make a Scanner Object
	scanf("%d", &a[i]);


	// Initializing 
	big = a[0];


	

	// From 2nd element to the last element
	// find the bigger element than big and 
	// update the value of big

	for (i = 1; i < size; i++)
	{

		// Make an if statement

		// If the larger value is encountered
		if (big < a[i])
		{

			// Update the value of big
			big = a[i];
		}
	} 

	// Print the largest element
	printf("\n\nThe largest element is: %d", big);

	// Update the value of small
	small = a[0];

	// Print the smallest element
	printf("\n\nThe Smallest Element is: %d", small);

	printf("\n\n\t\t\tSenal Bulumulle likes making things!\n\n\n");

	// End the program
	return 0;	
}