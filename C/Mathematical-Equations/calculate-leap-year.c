#include <stdio.h>


int main()
{

	
	/* Int Variables */
	
	// Make an int variable called y
	int year;



	// Prompt the user to enter the year
	printf("Enter year: ");

	// Make a Scanner Object 
	scanf("%d", &year);



	/* If statements */

	if (year % 4 == 0)
	{

		if ( year % 100 == 0)

	{

		if ( year % 400 == 0)
			printf("%d is a Leap Year", year);

		else
			printf("%d is not a Leap Year", year);
	}
	else
		printf("%d is a Leap Year", year);

	}
	else
		printf("%d is not a Leap Year", year);

	return 0;

}
