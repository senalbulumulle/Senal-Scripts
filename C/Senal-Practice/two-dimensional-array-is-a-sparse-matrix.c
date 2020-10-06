#include <stdio.h>

int main()
{

	printf("\n\n\t\tSenal Programmming Lesson - Best place to learn\n\n\n");

	// Make int variables 
	int n, m, c, d, matrix[10][10];
	int counter;

	// Prompt the user to enter the number of rows and columns of the matrix
	printf("\nEnter the number of rows and columns of the matrix \n\n");

	// Make a scanner object
	scanf("%d%d", &m, &n);

	// Prompt the elements of the matrix 
	printf("\nEnter the %d elements of the matrix \n\n", m * n);

	// Make a for loop
	for (c = 0; c < m; c++)
	{
		for(d = 0; d < n; d++)
		{
			scanf("%d", &matrix[c][d]);
			if(matrix[c][d] == 0)
			counter ++;
		}
	}

	// Printing the matrix 
	printf("\n\nThe enter matrix is: \n\n");

	for (c = 0; c < m; c++)
	{
		for(d = 0; d < n; d++)
		{
			printf("%d\t", matrix[c][d]);
		}

	printf("\n");
	}

	// Checking if the matrix is sparse or not
	if(counter > (m*n) / 2)
		printf("\n\nThe entered matrix is a sparse matrix\n\n");

	else
		printf("\n\nThe entered matrix is not a sparse matrix\n\n");

	printf("\n\n\t\t\tSenal Bulumulle likes making things!\n\n\n");

	// End the program 
	return 0;
	
}
