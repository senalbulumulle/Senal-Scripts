#include <stdio.h>

int main(int argc, char **argv)
{
	printf("\n\n\t\tSenal Bulumulle Programming Quiz - Best place to learn\n\n\n");
	
	// Make a char variable called ch
	char ch;
	
	// Prompt the user to input a character
	printf("Input a Character: ");
	
	// Make a Scanner Object for character
	scanf("%c", &ch);
	
	/* Make a switch case that contains all of the cases of letters that compatible 
	 * for a vowel. This is based on the char variable that has been created called 
	 * "ch".
	 */
	 
	 switch(ch)
	 {
		 case 'a':
		 case 'A':
		 case 'e':
		 case 'E':
		 case 'i':
		 case 'I':
		 case 'o':
		 case 'O':
		 case 'u':
		 case 'U':
			printf("\n\n%c is a vowel.\n\n", ch);
			break;
		default:
			printf("%c is not a vowel.\n\n", ch);
		}
		
	
	printf("\n\n\t\t\tSenal Bulumulle likes making things!\n\n\n");
	
	// End the program 
	return 0;
}

