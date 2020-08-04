#include <stdio.h>

int main()
{

    /* Int Variables */

    // Make an int variable called num1
    int num1;

    // Make an int variable called num2
    int num2;

    // Make an int variable called answer
    int answer;



    // Prompt the user to enter the first number
    printf("Enter first number: ");

    // Make a Scanner Object
    scanf("%d", &num1);

    // Prompt the user to enter the second number
    printf("Enter second number: ");

    // Make a Scanner Object
    scanf("%d", &num2);


    // Find out the answer
    answer = num1 + num2;

    // Print out the sum to the user 
    printf("Sum of the entered numbers: %d", answer);

    // End the program
    return 0;
}