#include <stdio.h>

void main()
{

    // Make an int variable called num
    int num;

    // Prompt the user to enter the number
    printf("Enter a number: \n");

    // Create a Scanner Object
    scanf("%d", &num);

    // Make an if statement
    if (num > 0)
    printf("%d is a positive number \n", num);
    
    else if (num < 0)
    printf("%d is a negative number \n", num);

    else 
    printf("0 is neither positive nor negative");
}