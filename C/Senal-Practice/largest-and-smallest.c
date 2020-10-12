#include <stdio.h>

int a, b; 

int main()
{

	printf("\n\n\t\tSenal Programming Lesson - Best place to learn \n\n\n");

	// Prompt the user to enter the two values to find the greatest and smallest number 
	printf("\n\nEnter the two values to find the greatest and smallest number: \n");

	// Make a Scanner Object
	scanf("%d%d", &a, &b);

	// Make an if-statement
	if (a == b)
		printf("Both are equal\n");

	else if(a < b)
	{
		printf("\n\nThe largest number is %03d\n", b);
		printf("\n\nThe Smallest number is %03d\n", a);
		printf("\n\nThe largest number is %03d\n", b);
	}

	// Only if it's possible to be remained.  
	else
	{
		printf("The largest number is %03d\n", a);
		printf("The smallest number is %03d\n", b);
	}

	printf("\n\n\t\t\tSenal Bulumulle likes making things!\n\n\n");
	return 0;
}
