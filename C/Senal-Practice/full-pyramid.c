#include <stdio.h> 

int main() {

	// Make int variables called i, space, rows, and k
	int i, space, rows, k = 0;

	// Prompt the user to enter the number of rows
	printf("Enter the number of rows: ");

	// Make a scanner object
	scanf("%d", &rows);

	// Make a for loop
	for (i = 1; i <= rows; ++i, k = 0) {


		for (space = 1; space <= rows - i; ++space) {

			printf("  ");
		}

		
		while (k != 2 * i - 1) {

			printf("* ");

			++k;
		}

		printf("\n");
	}

	// End the program 
	return 0;
}
