#include <stdio.h> 

int main() {

	// Make an int variable called i and j
	int i, j;

	// Char variable 
	char input, alphabet = 'A';

	// Prompt user to enter an uppercase character you want to print in the last row
	printf("Enter an uppercase character you want to print in the last row: ");

	// Make an scanner object
	scanf("%c", &input);

	// Make a for loop 
	for (i = 1; i <= (input - 'A' + 1); ++i) {
		for (j = 1; j <= i; ++j) {

			printf("%c", alphabet);
		}
		++alphabet;
		printf("\n");
	}

	// End the program
	return 0;
}
