#include <stdio.h>
#include <string.h>
int main(int argc, char **argv)
{
	printf("\n\n\t\tSenal Programming Lesson - Best place to learn\n\n\n");
	
	// Make a char variable called mj
	char mj[100];
	char aj[100];
	
	// Explain the user 
	printf("\n\nstrcpy(destination, source); is a system defined method used to copy the source string into the destination.\n\n");
	
	// Prompt the user to enter the string
	printf("\n\nEnter the string: ");
	
	// The char, "aj" gets the reward
	extern char *gets(char *(aj));
	
	// The char, "mj" and "aj" is passed on 
	// to strcpy
	strcpy(mj, aj);
	
	// Inform the user the copied string 
	printf("\n\nThe copied string is: %s\n\n", mj);
	
	printf("\n\n\t\t\tSenal Bulumulle likes making things\n\n\n");
	
	return 0;
}

