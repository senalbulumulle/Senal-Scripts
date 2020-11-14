#include <stdio.h>
#include <ncurses.h>

void cal(void);
void main()
{
	// Make an int variable called i and n 
	int i, n;
	clrscr();
	
	// Prompt the user to enter the number of employees
	printf("\nENTER THE NUMBER OF HTE EMPLOYEES: ");
	
	// Make a Scanner Object
	scanf("%d", &n);
    rm 
    // Make a for loop 
    for (i = 1; i <= n; i++)
				cal();
	getch();
}

void cal()
{
	// Make an int variable called basic
	int basic; 
	
	// Make a float variable called tax
	float tax;
	
	// Prompt the user to enter the amount of basic
	printf("\nENTER THE AMOUNT OF BASIC: ");
	
	// Make a Scanner Object 
	scanf("%d", &basic);
	
	// Make an if-else statement
	if (basic < 9000)
			tax=basic*20/100;
	
	else
			tax=basic*25/100;
			
	printf("\nTHE AMOUNT OF TAX IS %0.2f\n", tax);
}
