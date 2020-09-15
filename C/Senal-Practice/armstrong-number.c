#include <stdio.h>
#include <math.h>

int main()
{

	printf("\n\n\t\t Senal Programming Lesson - Best place to learn\n\n\n");

	/* Int Variables */

	// Make an int variable called n 
	int n;

	// Make an int variable called sum
	int sum;

	// Make an int variable called i 
	int i;

	// Make an int variable called t
	int t;

	// Make an int variable called a
	int a;



	/* For loop */

	// Make a for loop
	for (i = 1; i <= 500; i++)
	{

		// As we neeed to retain the original number
		t = i; 
		sum = 0;


		// Make a while loop
		while (t != 0)
		{

			a = t % 10;
			sum += a * a * a;
			t = t/10;
			
		}

		if (sum == i)

		printf("\n\t\t\t%d", i);
	} 

	printf("\n\n\n\n\t\t\tSenal Bulumulle \n\n\n");

	// End the program 
	return 0;
}