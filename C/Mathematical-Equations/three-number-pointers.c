#include <stdio.h>

int main()
{

	/* Int Variables */

	// Make an int variable called num1
	int num1;

	// Make an int variable called num2
	int num2;

	// Make an int variable called num3
	int num3;

	// Make an int variable called *p1
	int *p1;

	// Make an int variable called *p2
	int *p2;

	// Make an int variable called *p3
	int *p3;



	// Prompt the user to enter the first number
	printf("Enter the first number: ");

	// Make a new Scanner Object 
	scanf("%d", &num1);

	// Prompt the user to enter the second number
	printf("Enter the second number: ");

	// Make a new Scanner Object
	scanf("%d", &num2);

	// Prompt the user to enter the third number
	printf("Enter Third Number: ");

	// Make a new Scanner Object
	scanf("%d", &num3);



	// Assign p1 to num1
	p1 = &num1;

	// Assign p2 to num2
	p2 = &num2;

	// Assign p3 to num3
	p3 = &num3;



	/* If statements */

	// Make an if-statement
	if (*p1 > *p2)
	{

		if (*p1 > *p3)
		{

			printf("%d is the largest number", *p1);
		}

		else
		{

			printf("%d is the largest number", *p3);
		}
	}
	else
	{
		if(*p2 > *p3)
		{

			printf("%d is the largest number", *p2);
		}

		else
		{

			printf("%d is the largest number", *p3);
		}
	}

	// End the program
	return 0;

	}