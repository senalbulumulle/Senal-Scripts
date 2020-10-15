#include <stdio.h>

/* Function to reverse arr[] from the start to end */
void reverseArray(int arr[], int start, int end)
{

	// Make an int variable called temp
	int temp; 

	// Make an if statement 
	if (start >= end)
		return;

	temp = arr[start];
	arr[start] = arr[end];
	arr[end] = temp;
	reverseArray(arr, start + 1, end - 1);
    printf("Reversed array is \n");
    printArray(arr, 6);

    // End the program 
    return 0;
}