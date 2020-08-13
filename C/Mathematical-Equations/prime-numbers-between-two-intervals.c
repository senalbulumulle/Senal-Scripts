#include <stdio.h>

int main()
{

	/* Int Variables */

	// Make an int variable called low
	int low;

	// Make an int variable called high
	int high;

	// Make an int variable called i
	int i;

	// Make an int variable called flag
	int flag;



	// Prompt the user to enter two numbers
	printf("Enter two numbers(intervals): ");

	// Make a Scanner Object
	scanf("%d %d", &low, &high);

	// Show the user what the prime numbers are
	printf("Prime numbers between %d and %d are: ", low, high);



	// Make a while loop to understand which numbers are high or low
	while (low < high) {
		flag = 0;
	

	// Make an if-else statement ignoring numbers less than 2
	if (low <= 1) {
		++low;
		continue;
	}

	// Make a for-loop if the number is a non-prime number
	for (i = 2; i <= low / 2; ++i) {

		if (low % i == 0) {
			flag = 1;
			break;
		}
	}

	// Make an if-statement to check if the flag is zero, it will print the low digit.
	if (flag == 0)

		// Print the low number
		printf("%d", low);

		// Increase to check prime number by 1, you need to increase the number by 1
		++low;
}

// End the program
return 0;
}