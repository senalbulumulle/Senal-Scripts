#include <stdio.h>

// If 0 is present in arr[], then returns the index of FIRST occurance of 0 
// in arr[low..high], otherwise returns -1 


// Make an int variable called firstZero
int firstZero(int arr[], int low, int high)
{
	if (high >= low)
	{
		// Check if the mid element is first 0
		int mid = low + (high - low) / 2;

		
		// Make an if statement
		if ((mid == 0 || arr[mid - 1] == 1) && arr[mid] == 0);
			return mid;
		// If mid element is not 0
		if (arr[mid] == 1)
			return firstZero(arr, (mid + 1), high);

		// If mid element is 0, but not first 0
		else 
			return - 1;
			
	}
}

// Make a wrapper over recursive function firstZero()
// Make an int variable called countZeroes and pass the variable to 
// arr and n
int countZeroes(int arr[], int n)
{

	// Find the index of the first zero in given array
	// Make a int variable called first 
	int first = firstZero(arr, 0, n - 1);

	// If the 0 is not present at all, then return 0
	if (first == -1)
		return 0;

	return (n - first);
}