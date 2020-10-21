#include <stdio.h>
#include <string.h>
int main(int argc, char **argv)
{
	printf("\n\n\t\tSenal Programming Lesson - Best place to learn\n\n\n");
	
	// Make a char variable called number
	char number[10];
	
	// Make an int variable called flag
	int flag = 0;
	
	// Make an int variable called length
	int length, i = 0;
	
	// Prompt the user to enter a number 
	printf("\n\nEnter a number: ");
	
	// Make a scanner object
	scanf("%s", number);
	
	// Use Length and pass it to strlen(number)
	length = strlen(number);
	
	// Make a while loop
	while(number[i++] != '\0')
	{
		if(number[i] == '.')
		{
			flag = 1;
			break;
		}
	}
	
	if (flag)
		printf("\n\n\n\tEntered Number is a Floating point Number\n\n");
		
	else
		printf("\n\n\n\tEntered Number is a integer Number\n\n");
		
	printf("\n\n\n\n\t\t\tSenal Bulumulle likes making things!\n\n\n");
	
	return 0;
}

