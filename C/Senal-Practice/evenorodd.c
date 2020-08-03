#include <stdio.h>

int main()
{

    // Make an int variable called "num"
    int num;

    // Prompt user to enter a number
    printf("Enter an integer: ");

    // Make a Scanner Object 
    scanf("%d", &num);

    // Make an if-else statement for integers divided by 2 with no remainder or even, or else odd. 
    if ( num%2 == 0)
    printf("%d is an even number", num);
    else
    printf("%d is an odd number", num);
}