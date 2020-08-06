#include <stdio.h>
#include <string.h>

int main()
{

    /* Int Variables */

    // Make an int variable called i
    int i;

    // Make an int variable called j
    int j;

    // Make an int variable called count
    int count;



    // Multi-Dimentional Arrays
    char str[25] [25], temp[25];

    // Prompt the user to give how many names they will enter
    puts("How many names are you going to enter?: ");

    // Make a Scanner Object for "count"
    scanf("%d", &count);

    // Prompt the user to give the names one by one
    puts("Enter Strings one by one: ");



    /* For Loops */

    // Make a for loop for how many strings
    for (i = 0; i <= count; i++)
        gets(str[i]);

    // Make a for loop for user to enter a string one by one
    for (i = 0; i <= count; i++)
        for(j = i + 1; j <= count; j++) {

            if (strcmp (str[i], str[j]) > 0) {

                strcpy (temp, str[i]);

                strcpy(str[i], str[j]);

                strcpy(str[j], temp);
            }
        } 


     // Print the sorted names to the user
     printf("Order of Sorted Names: ");

     // Make a For Loop to repeat each name
     for (i = 0; i < count; i++)
        puts (str[i]);

     // End the program
     return 0;            
}