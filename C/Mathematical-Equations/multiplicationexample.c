#include <stdio.h>

int main()
{

    /* Float Variables */

    // Make a float variable called num1
    float num1;

    // Make a float variable called num2
    float num2;

    // Make a float variable called answer
    float answer;



    // Prompt the user to enter the first number
    printf("Enter the first number: ");

    // Create a Scanner Object 
    scanf("%f", &num1);

    // Prompt the user to enter the second number
    printf("Enter the second number: ");

    // Create a Scanner Object
    scanf("%f", &num2);

    // Find the answer
    answer = num1 * num2;

    // Show the user what the result is 
    printf("Answer of entered numbers is: %.3f", answer);

    // End the program
    return 0;
}