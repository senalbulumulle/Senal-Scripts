#include <stdio.h>

int main() {

	// Make double variables called a and b
	double a, b;

	// Prompt the user to enter a
	printf("Enter a: ");

	// Make a Scanner Object 
	scanf("%lf", &a);

	// Prompt the user to enter b 
	printf("Enter b: ");

	// Make a Scanner Object 
	scanf("%lf", &b);

	// The Number Swap Machine 

	/* Reference 
    a = (initial_a - initial_b)
    b = (initial_a - initial_b) + initial_b = initial_a
    a - initial_a - (initial_a - initial_b) - initial_b

    */

    a = a - b;
    b = a + b;
    a = b - a;

    /* Notify the User */

    // Notify user after the number a has been swapped 
    printf("After swapping a - %.2lf\n", a);

    // Notify user after the number b has been swapped
    printf("After swapping, b - %.2lf", b);

    // End the program 
    return 0;
}
