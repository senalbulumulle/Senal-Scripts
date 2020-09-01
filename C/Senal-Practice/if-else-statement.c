#include <stdio.h>

int main() {

	// Make an int variable called number
	int number;

	// Prompt the user to enter the integer
	printf("Enter an integer: ");

	// Make a scanner object 
	scanf("%d", &number);

	// Make a if-else statement to see if the number is less than 0
	if (number < 0) {
		printf("You entered %d. \n", number);
	}

	// Prompt the user that the if statement is easy
	printf("The if statement is easy.");

	// End the program
	return 0;
}