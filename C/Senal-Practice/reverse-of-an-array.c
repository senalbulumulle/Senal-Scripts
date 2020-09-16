#include <stdio.h>

int main()
{

	printf("\n\n\t\tSenal Programming Lesson - Best Place to Learn\n\n\n");


	/* Int Variables */
	int c, d, n, a[100], b[100];

	// Prompt the user to enter the number of elements in an array 
	printf("\n\nEnter number of elements in an array :");

	// Make a Scanner Object
	scanf("%d", &n);

	// Prompt the user to enter the elements
	printf("\n\nEnter %d elements\n", n);


	/* For loop */

	// Make a for loop 
	for (c = 0; c < n; c++)
		scanf("%d", &a[c]);


	// Temporaily storing elements into array b 
	// Starting from end of array a

	for (c = n - 1, d = 0; c >= 0; c--, d++)
		b[d] = a[c];


	// Copying reversed array into original 
	// Here in this program, it is modified to an original array to reverse it. 

	for (c = 0; c < n; c++)
		a[c] = b[c];


	// Print the result of the array
	printf("\n\n The result of an array is: ");

	for (c = 0; c < n; c++)
		printf("%d", a[c]);


	printf("\n\n\t\tSenal Bulumulle\n\n\n");

	// End the program
	return 0;
}