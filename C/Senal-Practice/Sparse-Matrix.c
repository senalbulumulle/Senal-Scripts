#include <stdio.h>

int main()
{

	printf("\n\n\t\tSenal Programming Lesson - Best place to learn\n\n\n");\

	// Int variables
	int n, m, c, d, matrix[10][10];

	int counter = 0;

	// Prompt the user to enter the number of rows and columns of the matrix
	printf("\nEnter the %d elements of the matrix \n\n", m * n);

	// Make a for loop
	for (c = 0; c < m; c++)
	{
		for (d = 0; d < n; d++)
		{

			// Make the scanner variable
			scanf("%d", &matrix[c][d]);

			// If statement
			if (matrix[c][d] == 0)

			// Same as counter = counter +1
			counter++;
		}
	}

	// Print the matrix
	printf("\n\nThe entered matrix is: \n\n");


	// To interate the rows
	for (c = 0; c < m; c++)
	{      
		// To interate the columns
		for(d = 0; d < n; d++)
		{
			printf("%d\t", matrix[c][d]);
		}

	// To take the control to the next row
	printf("\n");
	}

	// checking if the matrix is sparse or not
	if (counter > (m * n) /2)
		printf("\n\nThe entered matrix is a sparse matrix\n\n");

	else
		printf("\n\nThe entered matrix is not a sparse matrix\n\n");

	printf("\n\n\t\t\t Senal Bulumulle likes making things!");

	// End the program
	return 0;

	}			