#include <stdio.h>


// Make an int variable called power 
// and make a nested variable
// called n1 and n2
int power(int n1, int n2);

	
int main(int argc, char **argv)
{
	printf("\n\n\t\tSenal Programming Lesson - Best place to learn\n\n\n");
	
	// Make int variables called base and exp
	int base, exp;
	
	// Prompt the user to enter the base number
	printf("Enter base number: ");
	
	// Make a scanner variable 
	scanf("%d", &exp);
	
	// Inform the user with some data
	printf("\n\n\n\t\t\t%d^%d", base, exp, power(base,exp));
	
	printf("\n\n\t\t\tSenal Bulumulle likes making things!\n\n\n");
	return 0;
}

// Make an int variable called power and 
// make a nested int variable called b and e
int power(int b, int e)
{
	// Make an if statement 
	if(e == 0)
		return 1;
		
	return(b*power(b, e - 1));
}
