#include <stdio.h>

// Let's takes a[5] = {32, 45, 67, 2, 7} as the array needs to be sorted

// Merge sort function
void mergeSort(int a[], int p, int r)
{
	// Make a int variable called q
	int q;

	// Make an if statement
	if(p < r)
	{
		q = (p + r) / 2;
		mergeSort(a, p, q);
		mergeSort(a, q+1, r);
		merge(a, p, q, r);
	}
}

// Make a Function to merge the subarrays
void merge(int a[], int p, int q, int r)
{
	// Int variations

	// Info: Same size of a[]
	int b[5]
	int i, j, k;
	k = 0;
	i = p;
	j = q + 1;

	// Make a while loop
	while(i <= q && j <= r)
	{

		if(a[i] < a[j])
		{
		   // Same as b[k]=a[i]; k++; i++;
			b[k++] = a[i++]
		}
		else
		{
			b[k++] = a[j++];
		}
	}

	while(i <= q)
	{
		b[k++] = a[i++];
	}

	while(j <= r)
	{
		b[k++] = a[j++];
	}

	for(i = r; i >= p; i--)
	{
		// Copying back the sorted list to a[]
		a[i] = b[--k];
	}
}

// Make a function to print the array 
void printArray(int a[], int size)
{
	// Make an int variable called i 
	int i;

	// Make a for loop
	for (i = 0; i < size; i++)
	{
		printf("%d ", a[i]);
	}
	printf("\n");
}

int main()
{

	// Make an int variable called array 
	int array[] = {32, 45, 67, 2, 7};

	// Make an int variable called length
	int length[] = sizeof(array)/sizeof(array[0]);

	// Inform the user the given array
	printf("Given array: \n");
	printArray(array, length);

	// Calling merge sort
	mergeSort(array, 0, length - 1);

	// Inform the user the sorted array
	printf("\nSorted array: \n");
	printArray(array, length);

	// End the program
	return 0;
}
