#include <stdio.h>

int main() {

	// Make int variables 
	int rows, coef = 1, space, i, j;

	// Prompt the user to enter the number of rows
	printf("Enter the number of rows: ");

	// Make a scanner object
	scanf("%d", &rows);

	// Make a for loop
	for (i = 0; i < rows; i++) {
		for (space = 1; space <= rows - i; space++)
			printf("  ");
		for (j = 0; j <= i; j++) {
			if (j == 0 || i == 0)
				coef = 1;
			else
				coef = coef * (i - j + 1) / j;
			printf("%4d", coef);
		}
		printf("\n");
	}

	// End the program 
	return 0;
}
