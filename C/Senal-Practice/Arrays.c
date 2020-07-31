#include <stdio.h>

int main()
{
    /* Int Variables */

    // Make an int variable for "c"
    int c;

    // Make an int variable for "i"
    int i;

    // Make an int variable called "nwhite"
    int nwhite;

    // Make an int variable called "nother"
    int nother;

    // Make an int variable called "ndigit" and pass it with "[10]"
    int ndigit [10];

    nwhite = nother = 0;

    /* For Statements */

    // Make a for loop for "ndigit"
    for (i = 0; i < 10; ++i)
    {
        ndigit[i] = 0;
    }
    

    /* While Loops */

    // Make a while loop for "ndigit", "nwhite", "nother"
    while ((c = getchar()) != EOF) 
    {
        if (c >= '0' && c <= '9') 
            ++ndigit [c - '0'];
        

        else if (c == ' ' || c == '\n' || c == '\t') 
            ++nwhite;
        

        else 
            ++nother;
    }
        
        
    

    // Print the digits 
    printf("digits =");

    // Make a for loop
    for (i = 0; i < 10; ++i)
    {
        printf(" %d", ndigit [i]);
    }

    
    printf("\nwhite space = %d, other = %d\n", nwhite, nother);
}