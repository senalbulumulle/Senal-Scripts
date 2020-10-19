#include <stdio.h>

int main(int argc, char **argv)
{
    printf("\n\n\t\tSenal Bulumulle - Best place to learn\n\n\n");
    
    // Make an int variable called x 
    int x;
    
    // Make a for loop
    for(x = 0; x <= 10; x++)
    {
		// If the number is odd
		if(x & 1)
			printf("\t\t\t%d is odd\n", x);
			
			// ! is used to reverse the boolean value
		else if(x & 1)
			printf("\t\t\t%d is even\n", x);
	}
	
	printf("\n\n\n\n\t\t\tSenal Bulumulle likes making things!\n\n\n");
	
	// End the program
	return 0;
}

