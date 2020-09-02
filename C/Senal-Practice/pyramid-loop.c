#include <stdio.h>

int main() {

	/* Int Variables */

	// Make an integer called i 
	int i;

	// Make an integer called j 
	int j;

	// Make an integer called rows
	int rows;




	// Prompt the user to enter the number of rows
	printf("Enter the number of rows: ");

	// Make a Scanner Object
	scanf("%d", &rows);

	// Make a loop for repeating numbers in 1 row
	for(i = 1; i <= rows; ++i) {
		for(j = 1; j <= i; ++j) {
			printf("* ");
		}
		printf("\n");
	}

	// End the program 
	return 0;
}