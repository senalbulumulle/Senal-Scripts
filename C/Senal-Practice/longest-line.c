#include <stdio.h>

// Definition

// Make a Definition Name called MAXLINE
#define 	MAXLINE		1000



int main()
{

	/* Int Variables */

	// Make an int variable called length
	int length;

	// Make an int variable called maximum
	int maximum;



	/* Char Variables */

	// Make an char variable called line and pass with the MAXLINE Definition
	char line [MAXLINE];

	// Make an char variable called save and pass with the MAXLINE Definition
	char save [MAXLINE];



	// Use the maximum variable and make it equal 0
	maximum = 0;



	/* While Statements */

	// Make a while loop for the MAXLINE Definition
	while ((length = getline (line, MAXLINE)) > 0)
	
		if (length > maximum) {
			maximum = length;
			copy (line, save);
		}
		
	if (maximum > 0 )
		printf("%s", save);
}

	getLine(s, lim)

	// Make a char variable called s
	char s [];

	// Make an int variable called lim
	int lim;
{

	/* Int Variables */

	// Make an int variable called c
	int c;

	// Make an int variable called i
	int i;



	/* For loop statements */

	// Make a for loop for int variable c, and int variable i
	for (i = 0; i < lim -1 && (c = getchar()) != EOF && c!= '\n'; ++i)
		s [i] = c;

	if (c == '\n') {
		s [i] = c;
		++i;
	}

	s [i] = '\0';
	return (i);			
}

	int copy (s1, s2)

	// Make a char variable called s1
	char s1 [];

	// Make a char variable called s2
	char s2 [];
{
	// Make an int variable called i
	int i;

	// Make i equal 0
	i = 0;

	// Make a while statement
	while ((s2 [i] = s1 [i]) != '\0')
		++i;
}

// End the program
return 0;