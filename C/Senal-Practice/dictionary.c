#include <stdio.h>
#include <string.h> 

int main() {

	// Char variable 
	char str[5][50], temp[50];

	// Prompt the user to enter 5 words 
	printf("Enter 5 words: ");

	// Getting strings input 
	for (int i = 0; i < 5; ++i) {

		fgets(str[i], sizeof(str[i]), stdin);
	}

	// Storing strings in the lexicographical order 
	for (int i = 0; i < 5; ++i) {

		for (int j = i + 1; j < 5; ++j) {

			// Swapping strings if they are not in the lexicographical order
			if (strcmp(str[i], str[j]) > 0) {

				strcpy(temp, str[i]);
				strcpy(str[i],str[j]);
				strcpy(str[j], temp);
			}
		}
	}

	// Inform the user the lexicographical order 
	for (int i = 0; i < 5; ++i) {

		fputs(str[i], stdout);
	}

	// End the program 
	return 0;
}
