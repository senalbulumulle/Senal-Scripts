#include <stdio.h>

int main()
{
	printf("\n\n\t\tSenal Bulumulle - Best place to learn\n\n\n");
	
	// Make an int variable called n, and i  
	int n, i;
	
	// Make a float variable called sum and pass it to 0. Then make a another float variable 
	// alongside called x
	float sum = 0, x;
	
	// Prompt the user to enter the number of elements 
	printf("Enter number of elements:  ");
	
	// Make a scanner object 
	scanf("%d", &n);
	
	// Prompt the user to enter the selected number of elements
	printf("\n\n\nEnter %d elements\n\n", n);
	
	// Make a for loop
	for(i = 0; i < n; i++)
	{
		// Make a Scanner Object
		scanf("%f", &x);
		
		sum += x;
	}
	
	// Inform the user the average of the entered numbers. 
	printf("\n\n\nAverage of the entered numbers is = %f", (sum/n)); 
	
	printf("\n\n\n\n\t\tSenal Bulumulle likes making things !\n\n\n");
 }
