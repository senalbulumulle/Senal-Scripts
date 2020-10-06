#include <stdio.h>
#include <math.h>

// To use the sqrt method to find the square root of a number 
// that is included in the math.h header file. 


int main()
{

	printf("\n\n\t\tSenal Programming Lesson - Best place to learn\n\n\n");


	// Make int variables 
	int i, j, n, aj[10][10], sum = 0, sum1 = 0, a = 0, normal;

	// Prompt the user to enter the number of rows and columns of the matrix
	printf("\nEnter the number of rows (columns) of the matrix: \n\n");

	// Make a scanner object 
	scanf("%d", &n);

	// Prompt the user to enter the elements of the first matrix 
	printf("\nEnter the %d elements of the first matrix: \n\n", n * n);

	// Make a for loop

	// To iterate the rows
	for (i = 0; i < n; i++)
	{

		// To iterate the columns 
		for (j = 0; j < n; j++)
		{

			scanf("%d", &aj[i][j]);

			// Finding square of each element
			a = aj[i][j]*aj[i][j];

			// Same as sum1 + a
			sum1 += a;
		}
	}

	// Typecasting to double value
	normal = ((double)sum1);

	// Inform the user to see the given normal matrix is
	printf("\n\nThe normal of the given matrix is: %d", normal);

	// Make a for loop that repeats the sum
	for (i = 0; i < n; i++)
	{

		// Sum of the diagonal elements 
		sum = sum + aj[i][i];
	}

	// Inform the user to see the given trace of the matrix is 
	printf("\n\nThe Trace of the given matrix is: %d", sum);

	printf("\n\n\t\t\tSenal Bulumulle likes making things!\n\n\n");

	// End the program 
	return 0;
	
}
