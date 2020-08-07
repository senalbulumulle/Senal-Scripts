#include <stdio.h>
#include <math.h>

int main()
{

	/* Int Variable */

	// Make an int variable called triangle_side
	int TriangleSide;




	/* Float Variables */

	// Make a float variable called triangle_area
	float TriangleArea;

	// Make a float variable called temp_variable
	float TemperatureVariable;

	// Prompt the user to enter the length of the side 
	printf("\nEnter the Side of the triangle:");

	// Make a Scanner Object 
	scanf("%d", &TriangleSide);

	
	// Calculate and display data of the equilateral triangle
	TemperatureVariable = sqrt(3) / 4;
	TriangleArea = TemperatureVariable * TriangleSide * TriangleSide;

	// Print out the Area of the Equilateral Triangle 
	printf("\nArea of the Equilateral Triangle is: %f", TriangleArea);

	// End the Program
	return(0);
} 