#include <stdio.h>

int main()
{

    /* Int Variable */

    // Make an int variable called "circleRadius"
    int circleRadius;

    


    /* Float Variables */

    // Make a float variable called "PI_Value" and make it equal 3.14
    float PI_Value = 3.14;

    // Make a float variable called "circleArea"
    float circleArea;

    // Make a float variable called "circleCircumference"
    float circleCircumference;




    
    // Prompt the user to enter the radius of the circle
    printf("\n Enter the radius of the circle: ");

    // Make a new Scanenr Object
    scanf("%d", &circleRadius);


    // Calculate and display the Area Data
    circleArea = PI_Value * circleRadius * circleRadius;

    // Print the area of the circle to the user 
    printf("\n Area of the circle is: %f", circleArea);

    // Calculate and display the Circumference Data
    circleCircumference = 2 * PI_Value * circleRadius;

    // Print the circumference of the circle to the user 
    printf("\n Circumference of circle if: %f", circleCircumference);

    // End the program
    return 0;
}