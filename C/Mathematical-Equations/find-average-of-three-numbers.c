#include <stdio.h>


int main()
{

    /* Int Variables */

    // Make an int variable called "num1"
    int num1;

    // Make an int variable called "num2"
    int num2;

    // Make an int variable called "num3"
    int num3;



    /* Float Variable */

    // Make an float variable called "average"
    float average;



    // Prompt the user to enter the first number
    printf("Enter the first number: ");

    // Make a Scanner Object for "num1"
    scanf("%d", &num1);

    // Prompt the user to enter the second number
    printf("Enter the second number: ");

    // Make a Scanner Object for "num2"
    scanf("%d", &num2);

    // Prompt the user to enter the third number
    printf("Enter the third number: ");

    // Make a Scanner Object for "num3"
    scanf("%d", &num3);



    // Make an average equation 
    average = (float) (num1 + num2 + num3) / 3;

    // Print the user the results
    printf("Average of %d and %d and %d is: %.3f", num1, num2, num3, average);

    // End the program
    return 0;  
}