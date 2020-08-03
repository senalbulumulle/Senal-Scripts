#include <stdio.h>


int main()
{


    // Make a char variable called "ch"
    char ch;


    // Prompt the user to enter an alphabet
    printf("Enter an alphabet:\n");


    // Make a Scanner Object
    scanf("%c", &ch);


    // Make an if-else statement to determine if a letter is a vowel or not. 
    if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
    printf("%c is a Vowel\n", ch);


    else
    printf("%c is a constant\n", ch);


    // End the program
    return 0;
}