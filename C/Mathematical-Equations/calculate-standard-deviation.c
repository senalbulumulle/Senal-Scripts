#include <math.h>
#include <stdio.h>

float calculateSD(float data[]);

int main() {

	// Make an int variable called i
	int i;

	// Make a float variable called float
	float data[10];

	// Prompt the user to enter 10 elements 
	printf("Enter 10 elements: ");

	// Make a for loop
	for (i = 0; i < 10; ++i) 
		scanf("%f", &data[i]);

	// Print the standard deviation
	printf("\nStandard Deviation = %.6f", calculateSD(data));

	// Return 
	return 0;	
}

float calculateSD(float data[]) {
	float sum = 0.0, mean, SD = 0.0;

	// Make an int variable called i 
	int i;

	// Make a for loop
	for (i = 0; i < 10; ++i) {
		sum += data[i];
	}

	mean = sum / 10;

	// Make a for loop
	for (i = 0; i < 10; ++i)
		SD += pow(data[i] - mean, 2);

	// return 
	return sqrt(SD / 10);
}
