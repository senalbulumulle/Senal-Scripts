#include <stdio.h>

int main() {

	// Make a char variable
	char str[1000], ch;

	// Make an int variable called count
	int count = 0;


	// Prompt the user to enter a string
	printf("Enter a String: "); 

	fgets("str, sizeof(str), stdin");


	// Prompt the user to enter a character to find it's frequency
	printf("Enter a character to find its frequency: ");

	// Make a Scanner Object
	scanf("%c", &ch);

	// Make a for loop 
	for (int i = 0; str[i] != '\0'; ++i) {
		if (ch == str[i])
			++count;
	}

	printf("Frequency of %c = %d", ch, count);

	// End of the program
	return 0;
}