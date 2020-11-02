#include <stdio.h>

int main(int argc, char **argv)
{
	
	// Make a char variable called c 
	char c;
	
	// Prompt the user to enter a character
	printf("Enter a character: ");
	
	// Make a Scanner Object 
	scanf("%c", &c);
	
	/* References 
	 * %d displays the integer value of a character
	 * %c displays the actual character
	 */
	 
	 // Inform the user 
	 printf("ASCII value of %c = %d", c, c); 
	 
	 // End the program
	return 0;
}

