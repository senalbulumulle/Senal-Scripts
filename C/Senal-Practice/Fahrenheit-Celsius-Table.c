#include <stdio.h>

int main()
{
    /* Int Variables */

    // Make an int variable for "lower"
    int lower;

    // Make an int variable for "upper"
    int upper;

    // Make an int variable for "step"
    int step;


    /* Float Variables */

    // Make an float variable for "fahrenheit"
    float fahrenheit;

    // Make an float variable for "celsius"
    float celsius;



    
    // Call the "lower" variable and make it equal "0"
    lower = 0;

    // Call the "upper" variable and make it equal "300"
    upper = 300;

    // Call the "step" variable and make it equal "20"
    step = 20;


    // Make "fahrenheit" equal to "lower"
    fahrenheit = lower;


    // Make a while statement to print out the table
    while (fahrenheit <= upper) {
        celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
        
        // Print the Temperature
        printf("%4.0f %6.1f\n", fahrenheit, celsius);
        
        fahrenheit = fahrenheit + step;
    }
}