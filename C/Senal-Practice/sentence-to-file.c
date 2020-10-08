#include <stdio.h>
#include <stdlib.h>


int main() {

	// Make a char variable 
	char sentence[1000];

	// Creating file pointer to work with files 
	FILE *fptr;

	// Opening file in writing mode 
	fptr = fopen("program.txt", "w");

	// exiting program 
	if (fptr == NULL) {
		printf("Error!");
		exit(1);
	}

	// Prompt the user to enter the sentence
	printf("Enter a sentence:\n");

	// Processing
	fgets(sentence, sizeof(sentence), stdin);
	fprintf(fptr, "%s", sentence);
	fclose(fptr);
	return 0;
}
