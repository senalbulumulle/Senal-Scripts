#include <stdio.h>

int main(int argc, char **argv)
{
	
	// Make an int variable called intType 
	int intType;
	
	// Make an float variable called floatType
	float floatType;
	
	// Make a double variable called doubleType
	double doubleType;
	
	// Make a char variable called charType;
	char charType;
	
	/* Testing Machine */
	
	// Inform the user the types of variables 
	printf("Size of int: %zu bytes\n", sizeof(intType));
	
	printf("Size of float: %zu bytes\n", sizeof(floatType));
	
	printf("Size of double: %zu bytes\n", sizeof(doubleType));
	
	printf("Size of char: %zu byte\n", sizeof(charType));
	
	// End the program
	return 0;
}

