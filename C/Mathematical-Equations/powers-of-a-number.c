#include<stdio.h>

// Make int variables 
int power(int n1, int n2);

int main()
{

	printf("\n\n\t\tSenal Programming Language - Best place to learn\n\n\n");

	// Make int variables 
	int base, exp;

	// Prompt the user to enter the base number 
	printf("Enter base number: ");

	// Make a scanner object 
	scanf("%d", &base);

	// Prompt the user to enter the power factor 
	printf("\n\nEnter Power Factor: ");

	// Make a scanner object
	scanf("%d", &exp);

	// Print the result 
	printf("\n\n\n\t\t\t%d^%d = %d", base, exp, power(base, exp));

	printf("\n\n\t\t\tSenal Bulumulle likes making things\n\n\n");
	return 0;
}

int power(int b, int e)
{
	if(e == 0)
		return 1;

	return(b*power(b, e - 1));
}
