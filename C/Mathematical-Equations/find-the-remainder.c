#include <stdio.h>

int main()
{

    /* Int Variables */

    // Make an int variable called "num1"
    int num1;

    // Make an int variable called "num2"
    int num2;

    // Make an int variable called "answer"
    int answer;

    // Make an int variable called "remainder"
    int remainder;



    // Prompt the user to enter a dividend
    printf("Enter a dividend: ");

    // Make a Scanner Object for "num1"
    scanf("%d", &num1);

    // Prompt the user to enter a divisor
    printf("Enter a divisor: ");

    // Make a Scanner Object for "num2"
    scanf("%d", &num2);



    // Create a dividing equation
    answer = num1 / num2;

    // Create a remainder if the equation doesn't divide equally.
    remainder = num1 % num2;

    // Show both results
    printf("The Answer is: %d\n", answer);
    printf("The Remainder is: %d", remainder);

    // End the program 
    return 0;
}