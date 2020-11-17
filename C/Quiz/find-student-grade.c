#include <stdio.h>

int main(int argc, char **argv)
{
	// Make a float variable called marks
	float marks;
	
	// Make a char variable called grade
	char grade;
	
	// Prompt the user to enter the marks 
	printf("Enter Marks: ");
	
	// Make a Scanner Object 
	scanf("%f", &marks);
	
	
	// Make an if statement for the marking
	if (marks >= 90)
	{
		grade = 'A';
	}
	
	else if (marks >= 80 && marks < 90)
	{
		grade = 'B';
	}
	
	else if (marks >= 70 && marks < 80)
	{
		grade = 'C';
	}
	
	else if (marks >= 60 && marks < 70)
	{
		grade = 'D';
	}
	
	else if (marks >= 50 && marks < 60)
	{
		grade = 'E';
	}
	
	else 
	{
		grade = 'F';
	}
	
	// Inform the user what the grade is 
	printf("Your grade is %c", grade);
	
	// End the program
	return 0;
}

