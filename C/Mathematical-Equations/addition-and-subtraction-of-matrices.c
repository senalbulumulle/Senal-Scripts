#include <stdio.h>

int main()
{

	printf("\n\n\t\tSenal Programming Lesson - Best place to learn\n\n\n");


	// Int variables 
	int n, m, c, d, first[10][10], second[10][10], sum[10][10], diff[10][10];

	// Prompt the user to enter the number of rows and columns of the first matrix
	printf("\nEnter the number of rows and columns of the first matrix \n\n");
	scanf("%d%d", &m, &n);

	// Prompt the user to enter the number of rows and columns of the first matrix
	printf("\nEnter the %d elements of the first matrix \n\n", m * n);

	 
	// Make a for loop
	// To iterate the rows
	for(c = 0; c < m; c++)

		// To iterate the columns
		for(d = 0; d < n; d++) 

			scanf("%d", &first[c][d]);


	// Prompt the user to enter the number of rows and columns of the second matrix 
	printf("\nEnter the %d elements of the second matrix \n\n", m * n);

	// Make a for loop
	// To iterate the rows
	for(c = 0; c < m; c++)

		// To iterate the columns
		for(d = 0; d < n; d++)

			scanf("%d", &second[c][d]);


	// Print the first matrix 

	// Print the first matrix
	printf("\n\nThe first matrix is: \n\n");

	// Make a for loop

	// To iterate the rows
	for(c = 0; c < m; c++)
	{

		// To iterate the columns
		for (d = 0; d < n; d++)
		{
			printf("%d\t", second[c][d]);
		}

		printf("\n");
	}


	// Printing the second matrix
	printf("\n\nThe second matrix is: \n\n");

	// Make for loop

	// To iterate the rows
	for(c = 0; c < m; c++)

	// To iterate the columns
	for(d = 0; d < n; d++)
	{
		printf("%d\t", second[c][d]);
	}

	printf("\n");


	// Finding the SUM of the two matrices 
	// and storing in another matrix sum of the same size
	for(c = 0; c <m; c++)
		for(d = 0; d < n; d++)
			sum[c][d] = first[c][d] + second[c][d];


	// Printing the elements of the sum matrix
	printf("\n\nThe sum of the two entered matrices is: \n\n");

	// Make a for loop
	for(c = 0; c < m; c++)
	{

		for(d = 0; c < n; d++)
		{
			printf("%d\t", sum[c][d]);
		}
		printf("\n");
	}		


	// Finding the difference of the two matrices
	// and storing in another matrix difference of the same size
	for(c = 0; c < m; c++)
		for(d = 0; d < n; d++)
			diff[c][d] = first[c][d] - second[c][d];
		


	// Printing the elements of the diff matrix
	printf("\n\nThe difference(subtraction) of the two entered matrices is: \n\n");

	// Make a for loop
	for(c = 0; c < m; c++)
	{
		for(d = 0; d < n; d++)
		{
			printf("%d\t", diff[c][d]);
		}
	}

	printf("\n\n\t\t\tSenal Bulumulle like making things !\n\n\n");

	// End the program
	return 0;
	
	}