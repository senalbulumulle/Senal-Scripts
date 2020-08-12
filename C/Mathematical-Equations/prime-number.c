#include <stdio.h>



// Create a new method called checkPrime to be looped
int checkPrime (int num)
{

	// Make an int variable called i
	int i;

	// Make an int variable called flg and pass the variable to equal 0
	int flg = 0;

	// Make a for-loop
	for (i = 2; i < (num -1); i++)
	{

		if (num % i == 0) {

			flg = 1;
			break;
		}
	}

	// Make an if-else statement
	if (flg) return 0;

	else return 1;
}



// Make a new method called main()
int main()
{

	/* Int Variables */

	// Make an int variable called i 
	int i;

	// Make an int variable called n
	int n;



	// Prompt the user to enter the value of N
	printf("Enter the value of N: ");

	// Make a new Scanner Object 
	scanf("%d", &n);



	// Show user that all the numbers from 1 to N that are prime
	printf("All prime numbers are from 1 to %d: \n", n);

	// Create a for-loop to repeat the checkPrime Method 
	for (i = 1; i <= n; i++)
	{

		// Make an if-statement to only check the prime method
		if (checkPrime(i))
			printf("%d", i);
	}

	// End the program
	return 0;
}