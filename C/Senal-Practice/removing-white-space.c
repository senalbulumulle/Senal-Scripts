#include <stdio.h>
#include <string.h>

int main()
{

	printf("\n\n\t\t\tSenal Programming Lesson - Best place to learn\n\n\n");
	char aj[1000], mj[1000];
	int i = 0, j = 0, len;

	printf("\n\nEnter the string: ");
	fgets(aj);

	// len stores the length of the input string
	len = strlen(aj);

	// till string doesn't terminate
	while(aj[i] != '\0')
	{
		// if the char is not a white space
		if(aj[i] != '\0')
		{
			// incrementing index j only when the char
			// is not space
			mj[j++] = aj[i];
		}

		// i is the index of the actual string and is incremented inrrespective 
		// of the spaces 
		i++;
	}
	mj[j] = '\0';
	printf("\n\nThe string after removing all the spaces is: %s", mj);
	printf("\n\n\t\t\tSenal Bulumulle likes making things!\n\n\n");
	return 0;
}
