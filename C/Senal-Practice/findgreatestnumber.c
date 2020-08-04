#include <stdio.h>

int main()
{

    /* Int variables */

    // Make a int variable called num1
    int num1;

    // Make a int variable called num2
    int num2;

    // Make a int variable called num3
    int num3;



    // Prompt user to enter the three integer numbers
    printf("\nEnter value of num1, num2, num3: ");

    // Make a Scanner Object
    scanf("%d, %d, %d", &num1, &num2, &num3);

    // Make an if-else statement
    if ((num1 > num2) && (num1 > num3))
    printf("\n Number1 is the greatest");

    else if ((num2 > num3) && (num2 > num1))
    printf("\n Number2 is the greatest");

    else
    printf("\n Number3 is the greatest");

    // End the program
    return 0;
}