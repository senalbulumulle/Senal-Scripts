#include <stdio.h>

int main()
{
	// Print statements
	printf("\n\n\t\tStudytonight - Best place to learn\n\n\n");
	printf("\n\nNested loops are usually used to print a pattern in c. \n\n");
	printf("\n\nThey are also used to print out the matrix using a 2 dimensional array. \n\n");


	/* Int variables */

	// Make an int variable called "i"
	int i;

	// Make an int variable called "j"
	int j;

	// Make an int variable called "k"
	int k;



	// Print the output of the nested loop
	printf("\n\nOutput of the nested loop is: \n\n");



	/* For loops */

	// Make a for loop
	for (i = 0; i < 5; i++)
	{
		printf("\t\t\t\t");
		
		for (j = 0; j < 5; j++)
		
		printf("* ");

		printf("\n");
	}

	// Print statement
	printf("\n\n\t\t\tCoding is Fun !\n\n\n");

	// End the program
	return 0;
}