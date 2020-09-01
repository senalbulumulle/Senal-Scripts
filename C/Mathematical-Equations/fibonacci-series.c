#include <stdio.h>

int main() {

	// Integer variables 
	int i, n, t1 = 0, t2 = 1, nextTerm;

	// Prompt the user to enter the number of terms
	printf("Enter the number of terms: ");

	// Make a Scanner Object
	scanf("%d", &n);

	// Print the "Fibonacci Series" title
	printf("Fibonacci Series: ");

	// Make a for loop
	for (i = 1; i <= n; ++i)
	{
		printf("%d, ", t1);
		nextTerm = t1 + t2;
		t1 = t2;
		t2 = nextTerm;
	}

	// End the program
	return 0;
}