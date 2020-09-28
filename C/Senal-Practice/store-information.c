#include <stdio.h>

// Make a structure element called student
struct student {

	// Make a char name called "name"
	char name[50];
	int roll;
	float marks;
} s;


int main() {

	// Prompt the user to enter the information
	printf("Enter information:\n");

	// Prompt the user to enter the name
	printf("Enter name: ");

	fgets(s.name, sizeof(s.name), stdin);

	// Prompt the user to enter roll number 
	printf("Enter roll number: ");

	// Make a scanner object
	scanf("%d", &s.roll);

	// Print the user to enter the marks
	printf("Enter marks: ");

	// Make a scanner object
	scanf("%f", &s.marks);

	// Inform user by displaying the infomation of what they have entered
	printf("Displaying Information: \n");
	printf("%s", s.name);
	printf("Roll number: %d\n", s.roll);
	printf("Marks: %.1f\n", s.marks);


	// End the program
	return 0;
}
