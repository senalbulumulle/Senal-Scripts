#include <stdio.h>

int main()

{

	// Print the title
	printf("\n\n\tStudytonight - Best place to learn\n\n\n");


	/* Int Variable */

	// Make an int variable called "i"
	// declaration and intialization at the same time
	int i = 0;



	/* For loop */

	// Make a for loop
	for (i = 0; i < 10; i++)
	{
		printf("i = %d\n", i);

		/* 
		Consequently, when "i" equals 10, the loop breaks.
		"i" is updated before the condition is checked. Hence
		the value of "i" after exiting the loop is 10. 

		*/
	}

	// Print Statements 
	printf("\nThe value of i after exiting the loop is %d\n\n", i);
	printf("\nRemember that the loop condition checks the conditional statement before it loops again. \n\n");
	printf("Consequently, when i equals 10, the loop breaks. \n\n");
	printf("i is updated before the condition is checked- hence the value of i after exiting the loop is 10 .\n\n");
	printf("\n\n\t\t\tCoding is fun !\n\n\n");

	// End the program
	return 0;
}