#include <stdio.h>

int main()
{

	printf("\n\n\t\t\tSenal Programming lesson - The best place to learn\n\n\n");

	// Int variables


	// Actual variable declaration 
	int var = 24;
	int *p;

	// Storing addresses of int variable var in pointer p
	p = &var;

	// Inform the var variable is 
	printf("\n\nAddress of var variable is: %x \n\n", &var);


	// Address stored in pointer variable 
	printf("\n\nAddress stored in pointer variable is p is: %x", p);

	// Access the value using the pointer variable
	printf("\n\nValue of var variable or the value stored at address p is   %d", *p);

	printf("\n\n\t\t\tSenal Bulumulle likes making things!\n\n\n");

	// End the program 
	return 0;
}
