#include <stdio.h>
#include <ctype.h>

int main()
{
    printf("\n\n\t\tSenal Programming Language - Best place to learn\n\n\n");
    
    // Make a Char Variable called alphabet 
    char alphabet;
    
    // Prompt the user to enter an alphabet
    printf("Enter an alphabet : ");
    
    // To move to next line
    putchar('\n');
    
    alphabet=getchar();
    
    // Inform the user the reverse case is
    printf("\n\nReverse case of %c is : ", alphabet);
    
    // Make a if-else statement 
    if(islower(alphabet))
        putchar(toupper(alphabet));
        
    else 
        // Must be an uppercase character 
        printf("%c",tolower(alphabet));
        
    printf("\n\n\t\t\tSenal Bulumulle likes making things!\n\n\n");
    
    // End the program 
    return 0;
}
