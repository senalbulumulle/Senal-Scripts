#include <stdio.h>

int main() {

	// Make int variables 
	int rows, i, j, number = 1;

	// Prompt the user to enter the number of rows 
	printf("Enter the number of rows: ");

	// Make a scanner object 
	scanf("%d", &rows);

	// Make a for loop
	for (i = 1; i <= rows; i++) {

		for (j = 1; j <= i; ++j) {

			printf("%d ", number);
			++number;
		}

		printf("\n");
	}

	// End the program
	return 0;
}
