#include <stdio.h>
#include <stdlib.h>

int main()
{

    /* Int Variables */

    // Make an int variable called "i" (loop)
    int i;

    // Make an int variable called "j" (nested loop)
    int j;



    // Print the header of the multiplication table
    printf("Multiplication Table\n");



    /* For loops */

    // Make a for loop
    for (i = 1; i <= 10; i++) {
        
        // Create a nested for loop
        for (j = 1; j <= 10; j++) {
           printf("%d\t", i * j); 



        }

        // Print the entire table
        printf("\n");
    }

    // End the program 
    return 0;
}