#include <stdio.h>

int main() {

	/* Int variables */

	int n, i, flag = 0;

	// Prompt the user to enter a positive integer
	printf("Enter a positive integer: ");

	// Make a Scanner Object
	scanf("%d", &n);


	// Make a for loop
	for (i = 2; i <= n / 2; ++i) {

		// Condition for non-prime
		if (n % i == 0) {

			flag = 1;
			break;
		}
	}

	
	if (n == 1) {
		printf("1 is neither prime or composite.");
	}

	
	else {
		if (flag == 0)
			// Tell user that a number is a prime number
			printf("%d is a prime number.", n);

		else
			// Tell user that the number is not a prime number
			printf("%d is not a prime number.", n);
	}

	// End the program
	return 0;

	
}