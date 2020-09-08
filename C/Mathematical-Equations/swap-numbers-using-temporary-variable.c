#include <stdio.h>

int main() {

	/* Double Variables */

	// Make a double variable called "first"
	double first;

	// Make a double variable called "second"
	double second;

	// Make a double variable called "temporary"
	double temporary;



	// Prompt the user to enter the first number 
	printf("Enter first number: ");

	// Make a Scanner Object
	scanf("%lf", &first);

	printf("Enter second number: ");

	scanf("%lf", &second);



	// Value of first is assigned to temporary
	temporary = first;

	// Value of second is assigned to first
	first = second;

	// Value of temporary (initial value of first) is assigned to second
	second = temporary;


	// Print to the user to know after the system has swapped the first number
	printf("\nAfter swapping, firstNumber = %.21f\n", first);

	// Print to the user to know after the system has swapped the second number
	printf("After swapping, secondNumber = %.2lf", second);

	// End the program 
	return 0;
}