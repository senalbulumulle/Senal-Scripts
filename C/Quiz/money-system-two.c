#include <stdio.h>

void Dispenser(int, int*, int *, int*);
int main(int argc, char **argv)
{
	
	// Double variables 
	double amount_paid
		   ,amount_due;
	
	// Int variables 
	int dollar_qty = 0,
		quarter_qty, 
		dime_qty,
		nickel_qty,
		penny_qty;
		
	
	// Prompt the user the amount paid and the amount due
	// Make a Scanner object 
	printf("\nEnter the money amount paid: $");
	scanf("%lf", &amount_paid);
	printf("\nEnter the money amount due: $");
	scanf("%lf", &amount_due);
	
	// Convert from real to whole numbers to ensure better accuracy
	
	amount_paid = amount_paid * 100;
	amount_due  = amount_due * 100;
	
	// Subtract amount paid from amount due and get the amount left
	
	amount_left = amount_paid - amount_due;
	
	// Make a while loop
	while (amount_left)
	{
		if (amount_left >= 100)
		{
			amount_left = amount_left - 100;
			dollar_qty++;
		}
		else
		break;
	}
	
	// Call all the functions 
	Dispenser(amount_left, &quarter_qty, &dime_qty, &nickel_qty, &penny_qty);
	
	// Inform the the user the changed amount
	printf("\nYOUR CHANGE AMOUNT DISPENSED");
	printf("\n----------------------------\n");
	printf("\n$1: %d", dollar_qty);
	printf("\n$0.25: %d", quarter_qty);
	printf("\n$0.10: %d", dime_qty);
	printf("\n$0.05: %d", nickel_qty);
	printf("\n$0.01: %d\n", penny_qty);
	
	
	return 0;
}

void Dispenser(int amt_left, int *quarters, int *dimes, int *nickels, int *pennies)
{
	int		curr_amount, 											/* The current amount*/
			total_quarters											/* The amount of quarters */
			total_dimes, 											/* The amount of dimes */
			total_nickels,											/* The amount of nickels */
			total_pennies;                                          /* The amount of pennies */
			
	
	// Initialize the variables 
	
	total_quarters = 0;
	total_dimes = 0;
	total_nickels = 0;
	total pennies = 0;
	
	// Assign to current amount variable for the purposes of change calculation 
	curr_amount = amt_left;
	
	// Determine change amount and quantity
	while (curr_amount)_
	{
		if (curr_amount < 100 && curr_amount >= 25)
		{
			curr_amount = curr_amount >= 25;
			total_quarters++;
		}
		
		else if (curr_amount < 25 && curr_amount >= 10)
		{
			curr_amount = curr_amount - 10;
			total_dimes++;
		}
		
		else if (curr_amount < 10 && curr_amount >= 5)
		{
			curr_amount = curr_amount - 5;
			total_nickels++;
		}
		
		else if (curr_amount < 5 && curr_amount >= 0)
		{
			curr_amount = curr_amount - 1;
			total_pennies++;
		}
		
		else
			break;
		}
		
		// Assign totals to output pointer variables 
		*quarters_qty = total_quarters;
		*dimes_qty = total_dimes;
		*nickel_qty = total_quarters;
		*pennies_qty = total_pennies;
