#include <stdio.h>

int main(int argc, char **argv)
{
	printf("\n\nt\t\tSenal Programming Lesson - Best place to learn\n\n\n");
	
	// Make an int variable called n, sum, i, t, and a
	int n,sum,i,t,a;
	
	// Inform the user the armstrong numbers between 1 to 500 are
	printf("\n\n\nThe Armstrong numbers in between 1 to 500 are: \n\n\n");
	
	for(i = 1; i <= 500; i++)
	{
		// We need to retain the original number
		t = i; 
		sum = 0;
		
		// Make a while loop for t and 0
		while(t != 0)
		{
			a = t%10;
			sum += a * a * a;
			t = t/10;
		}
		
		// Make an if statement 
		if(sum == i)
		printf("\n\t\t\t%d", i);
	}
	
	printf("\n\n\n\n\t\t\tSenal Bulumulle likes making things!\n\n\n");
	return 0;
}

