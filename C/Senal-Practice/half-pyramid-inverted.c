#include <stdio.h>

int main() {

	// Make int variables called i, j, and rows
	int i, j, rows;

	// Prompt the user to enter the number of rows
	printf("Enter the number of rows: ");

	// Make a scanner object
	scanf("%d", &rows);

	// Make a for loop
	for (i = rows; i >= 1; --i) {

		for (j = 1; j <= i; ++j) {

			printf("* ");
		}

		printf("\n");
	}

	// End the program
	return 0;
}
