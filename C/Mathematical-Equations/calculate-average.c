#include <stdio.h>


int main() {

	/* Int Variables */

	// Make a int variable called "n"
	int n;

	// Make a int variable called "i"
	int i;



	/* Float Variable */

	// Make a float variable called num
	float num[100], sum = 0.0, avg;



	// Prompt the user to enter the number of elements
	printf("Enter the number of elements: ");

	// Make a scanner variable
	scanf("%d", &n);

	// Make a while loop
	while (n > 100 || n < 1) {
		printf("Error! number should in range of (1 to 100) \n");
		printf("Enter the number again: ");
		scanf("%d", &n);
	} 

	// Make a for loop for the numbers that are going to be added
	for (i = 0; i < n; ++i) {
		printf("%d Enter number: ", i + 1);
		scanf("%f", &num[i]);
		sum += num[i];
	}

	// Calculate the average 
	avg = sum / n;

	// Print the average
	printf("Average = %.2f", avg);

	// End the program
	return 0;
}