#include <stdio.h>


// Make a void method called "reverseSentence"
void reverseSentence();

int main() {

	// Prompt the user to enter a sentence. 
	printf("Enter a sentence: ");

	// Called the void method 
	reverseSentence();

	// End the method
	return 0;
}

void reverseSentence() {

	// Make a new char variable called c
	char c;

	// Make a scanner variable
	scanf("%c", &c);

	if (c != '\n') {

		// Print the reverse sentence
		reverseSentence();

		printf("%c", c);
	}
}