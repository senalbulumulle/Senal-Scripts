#include <stdio.h>

int main()
{
	// Make int variables
	int n, c, row, t = 1;

	// Make Scanner Object
	scanf("%d", &n);

	// Make a for loop
	
	for (row = 1; row <= n; row++) {

		for(c = 1; c <= n - row; c++)

			printf(" ");

		t = row;

		for (c = 1; c <= row; c++) {

			printf("%d", t);
			t++;
		}

		t = t - 2;

		for (c = 1; c < row; c++) {
			printf("%d", t);
			t--;
		}

		printf("\n");
	}

	// End the program 
	return 0;
	
}
