#include <stdio.h>

int main() {

	// Make int variables 
	int i, j;

	// Make char variables
	char input, alphabet = 'A';

	// Prompt the user to enter an uppercase character they want to print 
	// in the last row
	printf("Enter an uppercase character you want to print in the last row: ");

	// Make a scanner object
	scanf("%c", &input);

	// Make a for loop
	for (i = 1; i <=(input - 'A' + 1); ++i) {

		for (j = 1; j <= i; ++j) {

			printf("%c ", alphabet);
		}

		++alphabet;
		printf("\n");
	}

	// End the program 
	return 0;
}
