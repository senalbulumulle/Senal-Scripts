______
## Java Reference 
______ 
- [Java Reference](#java-reference)
	- [Demo Folder](#demo-folder)
		- [ComputeExpression.java](#computeexpressionjava)
		- [DisplayTime.java](#displaytimejava)
		- [Welcome.java](#welcomejava)
	- [Mathematical Equations Folder](#mathematical-equations-folder)
		- [AdditionQuiz.java](#additionquizjava)
		- [AreaOfTriangle.java](#areaoftrianglejava)
		- [AreaQuiz.java](#areaquizjava)
		- [CalculateAge.java](#calculateagejava)
		- [CalculatingPi.java](#calculatingpijava)
		- [ComputeAngles.java](#computeanglesjava)
		- [ComputeAreaWithConsoleInput.java](#computeareawithconsoleinputjava)
		- [ComputeAverage.java](#computeaveragejava)
		- [ComputeBMI.java](#computebmijava)
		- [ComputeChange.java](#computechangejava)
		- [ComputeBMI.java](#computebmijava-1)
		- [ComputeLoan.java](#computeloanjava)
		- [FactorQuiz.java](#factorquizjava)
		- [FahrenheitToCelsius.java](#fahrenheittocelsiusjava)
		- [FindingAverage.java](#findingaveragejava)
		- [GreatestCommonDivisor.java](#greatestcommondivisorjava)
		- [GuessBirthday.java](#guessbirthdayjava)
		- [HexDigit.java](#hexdigitjava)
		- [Lab.java](#labjava)
		- [LinearEquations.java](#linearequationsjava)
		- [Lottery.java](#lotteryjava)
		- [MathDemo.java](#mathdemojava)
		- [Multiplication.java](#multiplicationjava)
		- [PerimeterOfSquare.java](#perimeterofsquarejava)
		- [RepeatAdditionQuiz.java](#repeatadditionquizjava)
		- [SentinelValue.java](#sentinelvaluejava)
		- [showCurrentTime.java](#showcurrenttimejava)
		- [SubtractionQuiz.java](#subtractionquizjava)
		- [SubtractionQuizLoop.java](#subtractionquizloopjava)
		- [TestSum.java](#testsumjava)
	- [Real Life Scenarios](#real-life-scenarios)
		- [CalculateBucketFillUpTime.java](#calculatebucketfilluptimejava)
		- [CalculateMilesPerGallon.java](#calculatemilespergallonjava)
		- [CountriesAndContinents.java](#countriesandcontinentsjava)
		- [FutureTuition.java](#futuretuitionjava)
		- [GuessNumber.java](#guessnumberjava)
		- [LoanSchedule.java](#loanschedulejava)
		- [PrintCalendar.java](#printcalendarjava)
		- [TestMax.java](#testmaxjava)
	- [Senal Practice Folder](#senal-practice-folder)
		- [AdditionQuiz.java](#additionquizjava-1)
		- [DeckOfCards.java](#deckofcardsjava)
		- [Fun.java](#funjava)
		- [Intro.java](#introjava)
		- [OrderTwoCities.java](#ordertwocitiesjava)
		- [Palindrome.java](#palindromejava)
		- [SubtractionQuiz.java](#subtractionquizjava-1)
		- [TestVoidMethod.java](#testvoidmethodjava)
		- [zodiac.java](#zodiacjava)
	- [Writing String Code](#writing-string-code)
		- [CapitalTrivia.java](#capitaltriviajava)
		- [Chapt6Lab.java](#chapt6labjava)
		- [chineseZodiac.java](#chinesezodiacjava)
		- [StringReverse.java](#stringreversejava)

______
### Demo Folder
______
#### ComputeExpression.java
``` java
package demo;

public class ComputeExpression {

	public static void main(String[] args) {
		
		System.out.print("(10.5 + 2 * 3) / (45 - 3.5) = "); // Shows the Equation to the User.
		System.out.println((10.5 + 2 * 3)/ (45 - 3.5)); // Display the result to the User.

	}

}
```
#### DisplayTime.java
```` java
package demo;
import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompts the User to enter something in 
		
		System.out.print("Enter the amount of seconds: ");
		
		int seconds  = input.nextInt();
		
		int minutes = seconds / 60; // Find minutes in seconds
		
		int remainingSeconds = seconds % 60; // Seconds Remaining
		
		System.out.println(seconds + " seconds is " +  minutes + " minutes and  " + remainingSeconds + " seconds");


	}

}
````
#### Welcome.java
```` java
package demo;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("Welcome to Java!");

	}

}
````
______
### Mathematical Equations Folder
______

#### AdditionQuiz.java
```` java
import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() * 7 % 10);
		
		// create scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " + " + number2 + " ? ");
		
		// create answer variable 
		int answer = input.nextInt();
		
		// display equation with user answer. 
		System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
		
	}

}
````
#### AreaOfTriangle.java
````java
import java.util.Scanner;


public class AreaOfTriangle {

	public static void main(String[] args) {
		// Make a Scanner Object
		Scanner input = new Scanner(System.in);

		// Make an Int Variable called Base
		int base = (int)(Math.random() * 10) + 1; 

		// Make an Int Variable called Height
		int height = (int)(Math.random() * 10) + 1;

		// Prompt the User the Question
		System.out.println("If the Base is " + base + ", and the height is " + height + ", what is the area ?");

		// Make an Int Variable called Area
		int area = input.nextInt();
		
		// If the User gets the right answer, it will say that it is correct. Followed by the "if" on Line 24.
		// If the User gets the wrong answer, it will say that it is incorrect. Followed by the "else" on Line 27.
		if (base * height * 0.5 == area)
			System.out.println("You are Correct");
		
		else{
			System.out.println("You are Incorrect");
		}




	}

}

````
#### AreaQuiz.java
````java
import java.util.Scanner;


public class AreaQuiz {

	public static void main(String[] args) {
		
		// Create a variable called Length
		int length = (int)(Math.random() * 100) + 1;
		
		// Create a variable called Width
		int width = (int)(Math.random() * 100) + 1;
		
		System.out.println("If the length is " + length + " and the width is " + width + ", what is the area?");
		
		// Create a Scanner Object 
		Scanner input = new Scanner(System.in);
		
		// Create the area variable
		int area = input.nextInt();
		
		// Print out if the answer is right or wrong. 
		if (length * width == area)
			System.out.println("You are correct!");
		else {
			System.out.println("You are incorrect. The Area is: " + length * width);
		}
		

	}

}
````
#### CalculateAge.java
```` java
import java.util.Scanner;


public class CalculateAge {

	public static void main(String[] args) {
		// Create a Scanner Object 
		Scanner input = new Scanner(System.in);
		
		// Prompt User to enter First Name 
		System.out.print("Enter your First Name: ");
		String firstName = input.nextLine();
		
		// Prompt user to enter Middle Name 
		System.out.print("Enter your Middle Name:");
		String middleName = input.nextLine();
		
		
		
		// Prompt User to enter Last Name 
		System.out.print("Enter your Last Name: ");
		String lastName = input.nextLine();
		
		// Prompt User to enter year of birth 
		System.out.print("Enter your year of birth: ");
		int year = input.nextInt();
		
		// Age variable to calculate the age based on the current year. 
		// For Example, current year (2020) minus the birth date year.
		int age = 2019-year;
		
		// Display the Results of the Current Age of User 
		System.out.print(firstName + ", you are " + age + " years old.");
		
		// yearsTillBirthday variable
		int yearsTillBirthday  = 62-age;
		
		// Displays the Results of the Years till the User's Birthday 
		System.out.print("There are " + yearsTillBirthday + " years until you are 62 years old. ");
		
		
		
		
	}

}
````
#### CalculatingPi.java
````java
public class CalculatingPi {

	public static void main(String[] args) {
		System.out.println("i\t\tm(i)");
		for (int i = 10; i <=1000000; i += 10) {
			System.out.println(i + "\t\t" + m(i));
		}
	}
		
		// Create new method for double number
			public static double m(int n) {
				
				// Create a variable for Pi
				double pi = 0;
				double term;
			
				// Create a four loop to calculate a term 
				for (int i = 1; i <=n; i += 2) {
					term = 4.0 * (1.0 / (2 * i -1) -1.0 / (2 * i + 1));
					pi += term;
				}
				return pi;
	}

}
````
#### ComputeAngles.java
```` java
import java.util.Scanner;

public class ComputeAngles {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		// Prompts the user to enter three points 
		// For example,for (5,3) type 5 3 
		System.out.print("Enter three points: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();


		// Compute three sides
		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		// Compute three angles
		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c)  / (-2 * b * c )));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c)  / (-2 * a * c )));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b )));

		// Display the results 
		System.out.println("The three angles are " + 
			Math.round(A * 100) / 100.0 + " " + 
			Math.round(B * 100) / 100.0 + " " + 
			Math.round(C * 100) / 100.0); 
	}

}
````
#### ComputeAreaWithConsoleInput.java
```` java
import java.util.Scanner;


public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Prompts User to enter a number for radius.
		
		System.out.print("Enter a number for radius: ");
		int radius = input.nextInt();
		
		// compute area of circle
		double area = radius * radius * 3.14;
		
		// display result
		System.out.println("The area for the circle of radius " + radius + " is " + area );
	}

}
````
#### ComputeAverage.java
```` java 
import java.util.Scanner;


public class ComputeAverage {

	public static void main(String[] args) {
		// Create a Scanner Variable 
		Scanner input = new Scanner(System.in);
		
		// Prompt User to enter 3 numbers 
		System.out.print("Enter three numbers: ");
		
		// Create 3 different variables 
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// Compute average 
		int average = (number1 + number2 + number3) / 3;
		
		// Display Result
		System.out.println("Average of " + number1 + " ,  " + number2 + " ,  " + number3 + " is " + average);
	}

}
````
#### ComputeBMI.java
```` java
import java.util.Scanner;

public class ComputeBMI {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// prompt user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		// prompt user to enter height in inches 
		System.out.print("Enter height in inches : ");
		double height = input.nextDouble();
		
		// convert kilograms per pound 
		final double KILOGRAMS_PER_POUND = 0.45359257;
		
		//convert meters per inch 
		final double METERS_PER_INCH = 0.0254;
		
		// Create variables to calculate BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		
		// Calculate BMI 
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		System.out.printf("Your BMI is %5.2f\n", bmi);
		
		if (bmi < 16) 
			System.out.println("Your are seriously underweight.");
			
		else if (bmi < 18) 
			System.out.println("You are underweight");
		
		else if (bmi < 24)
			System.out.println("You are normal weight");
		
		else if (bmi < 29)
			System.out.println("You are overweight");
		
		else
			System.out.println("You are gravely overweight");
		
			
		
	}

}
````
#### ComputeChange.java
```` java
import java.util.Scanner;


public class ComputeChange {

	public static void main(String[] args) {
		// Create Scanner = Allows user to import data. 
		Scanner input = new Scanner(System.in);
		
		// Receive the amount from user. 
		System.out.print("Enter an amount in double, for example 11.56:  ");
		// Create a variable for the amount 
		double amount = input.nextDouble();
		
		// Create a variable for the remaining amount
		int remainingAmount = (int)(amount * 100);
		
		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		// Find the amount of quarters 
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		// Find the amount of dimes
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		// Find the amount of nickels 
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		// Find the amount of pennies 
		int numberOfPennies = remainingAmount;
		
		// Display the Results 
		System.out.println("Your amount:  " + amount + "  consists of");
		System.out.println("    " + numberOfOneDollars + "  dollars");
		System.out.println("    " + numberOfQuarters + "  quarters");
		System.out.println("    " + numberOfDimes + "  dimes");
		System.out.println("    " + numberOfNickels + "  nickels");
		System.out.println("    " + numberOfPennies + "  pennies");
		
		


	}

}
````
#### ComputeBMI.java
```` java
import java.util.Scanner;

public class ComputeBMI {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// prompt user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		// prompt user to enter height in inches 
		System.out.print("Enter height in inches : ");
		double height = input.nextDouble();
		
		// convert kilograms per pound 
		final double KILOGRAMS_PER_POUND = 0.45359257;
		
		//convert meters per inch 
		final double METERS_PER_INCH = 0.0254;
		
		// Create variables to calculate BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		
		// Calculate BMI 
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		System.out.printf("Your BMI is %5.2f\n", bmi);
		
		if (bmi < 16) 
			System.out.println("Your are seriously underweight.");
			
		else if (bmi < 18) 
			System.out.println("You are underweight");
		
		else if (bmi < 24)
			System.out.println("You are normal weight");
		
		else if (bmi < 29)
			System.out.println("You are overweight");
		
		else
			System.out.println("You are gravely overweight");
		
			
		
	}

}
````
#### ComputeLoan.java
```` java
import java.util.Scanner;


public class ComputeLoan {

	public static void main(String[] args) {
		// Create a Scanner Object 
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter yearly interest rate 
		System.out.print("Enter yearly interest rate, for example 8.25: ");
		double annualInterestRate = input.nextDouble();
		
		// Calculate the monthly interest rate 
		double monthlyInterestRate = annualInterestRate / 1200;
		
		// Prompt User for how long the loan lasts. 
		System.out.print("Enter number of years as an integer, for example: 5: ");
		int numberOfYears = input.nextInt();
		
		// Prompt User for loan amount.
		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();
		
		// Calculate monthly payments 
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		
		// Calculate total payments 
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
	    // Display Results 
		System.out.println("The monthly payment is " + (int) (monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is " + (int) (totalPayment * 100) / 100.0);
		
		

	}

}
````
#### FactorQuiz.java
```` java
import java.util.Scanner;

public class FactorQuiz {

	public static void main(String[] args) {
		// Generate Random Number 
		int number = (int)(Math.random() * 100);
		System.out.println(number);
		
		// Prompt user to enter an integer between 1 and 4 
		System.out.print("Enter an integer between 1 and 4: ");
		Scanner input = new Scanner (System.in);
		int factor = input.nextInt();
		
		// Show the result
		if (number % factor == 0)
		{
			System.out.println("The Value " + factor + " is a factor of " + number);
		}
		else
		{
			System.out.println("The value of " + factor + " is not a factor of " + number);
		}
		
	}

}
````
#### FahrenheitToCelsius.java
````java
import java.util.Scanner;


public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// Create Scanner Variable 
		Scanner input =  new Scanner (System.in);
		
		// Prompt User to enter degrees in Fahrenheit.
		System.out.print(" Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		// Convert Fahrenheit to Celsius
		double celsius = (5.0 / 9)* (fahrenheit - 32);
		
		// Print what the result is
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
		

	}

}
````
#### FindingAverage.java
````java
public class FindingAverage {

	public static void main(final String[] args) {
		
		// Input the Scanner
		final java.util.Scanner input = new java.util.Scanner(System.in);
		
		// Prompt User to enter the number of items
		System.out.print("Enter the number of items:");
		final int n = input.nextInt();

		// Create an array 
		final double[] numbers = new double [n]; 
		double sum = 0;

		// Prompt User to enter the numbers 
		System.out.print("Enter the numbers: ");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		final double average = sum / n;

		// The numbers of elements above average
		int count = 0;
		for (int i = 0; i < n; i++)

			// Count if number[i] > average
		   if (numbers[i] > average)
		   count++;

		// Print out the average 
		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average is " + count);
				



	}

}
````
#### GreatestCommonDivisor.java
````java
import java.util.Scanner;


/** Main Method */
public class GreatestCommonDivisorMethod {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		// Prints out the Greatest Common Divisor Answer
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
		
	}	
		
// Return the gcd of two integers 
public static int gcd(int n1, int n2) {
	// Initial gcd is 1 
	int gcd = 1;
	
	// Possible gcd 
	int k = 1;
	
	// Make a while loop so the gcd is always updated. 
	while (k <= n1 && k <= n2) {
		if (n1 % k == 0 && n2 % k == 0)
			// update gcd
			gcd = k; 
		k++;
		
	}
	// Returns gcd
	return gcd;
}
		
	}
````
#### GuessBirthday.java
````java
import java.util.Scanner;



public class GuessBirthday {

	public static void main(String[] args) {
		// Make a string of sets that contains numbers from the calendar
		String set1 = " 1 3 5 7\n" + " 9 11 13 15\n" + " 18 19 21 23\n" + " 25 27 29 31";
		String set2 = " 2 3 6 7\n" + " 10 11 14 15\n" + " 18 19 22 23\n" + " 26 27 30 31";
		String set3 = " 4 5 6 7\n" + " 12 13 14 15\n" + " 20 21 22 23\n" + " 28 29 30 31";		
		String set4 = " 8 9 10 11\n" + " 12 13 14 15\n" + " 24 25 26 27\n" + " 28 29 30 31";
		String set5 = " 16 17 18 19\n" + " 20 21 22 23\n" + " 24 25 26 27\n" + " 28 29 30 31";
		
		// Make an Integer Variable called "day"
		int day = 0;
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to answer questions 
		System.out.print("Is your birthday in Set1?\n");
		System.out.print(set1);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		int answer = input.nextInt();
		
		// Make an if statement for the variables "answer" and "day"
		if (answer == 1)
			day += 1;
		
		// Prompt the user to answer questions
		System.out.print("\nIs your birthday in Set2?\n");
		System.out.print(set2);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
		
		// Make an if statement for the variables "answer" and "day"

		if (answer == 1)
			day += 2;
		
		// Prompt the user to answer questions
		System.out.print("\nIs your birthday in Set3?\n");
		System.out.print(set3);
		System.out.print("\nEnter 0 for No and 1 for Yes:");
		answer = (input.nextInt());
		
		// Make an if statement for the variables "answer" and "day"
		if (answer == 1)
			day += 4;
		
		// Prompt the user to answer questions
		System.out.print("\nIs your birthday in Set4?\n");
		System.out.print(set4);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
		
		// Make an if statement for the variables "answer" and "day"
		if (answer == 1)
			day += 8;
		
		// Prompt the user to answer questions
		System.out.print("\nIs your birthday in Set5?\n");
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
		
		// Make an if statement for the variables "answer" and "day"
		if (answer == 1)
			day += 16;
		
		// Print the Results 
		System.out.println("\nYour birthday is " + day + "!");
		
	}

}
````
####  HexDigit.java
````java
import java.util.Scanner;


public class HexDigit2Dec {

	public static void main(String[] args) {
		// Create a Scanner Object 
		Scanner input = new Scanner(System.in);
		
		// Prompt User to enter a hex digit.
		System.out.print("Enter a hex digit: ");
		String hexString = input.nextLine();
		
		// Check if the hex string has exactly one character
		if (hexString.length() != 1) {
			System.out.println("You must enter exactly one character");
			System.exit(1);
		}
		
	    // Display decimal value for the hex digit
		char ch = Character.toUpperCase(hexString.charAt(0));
		if ('A' <= ch && ch <= 'F') {
			int value = ch - 'A' + 10;
			System.out.println("The decimal value for hex digit " + ch + " is " + value);
		}
		else if (Character.isDigit(ch)) {
			System.out.println("The decimal value for hex digit " + ch + " is " + ch);
		}
		else {
			System.out.println(ch + " is an invalid input");
		}

	}

}
````
#### Lab.java
```` java
public class Lab {

	public static void main(String[] args) {
		
		// Make Integer Variables from num1 to 10  to call 
		// "Math.random()" to randomly choose a number. 
        int num1 = (int) (Math.random() * 100 + 1);
        int num2 = (int) (Math.random() * 100 + 1);
        int num3 = (int) (Math.random() * 100 + 1);
        int num4 = (int) (Math.random() * 100 + 1);
        int num5 = (int) (Math.random() * 100 + 1);
        int num6 = (int) (Math.random() * 100 + 1);
        int num7 = (int) (Math.random() * 100 + 1);
        int num8 = (int) (Math.random() * 100 + 1);
        int num9 = (int) (Math.random() * 100 + 1);
        int num10 = (int)(Math.random() * 100 + 1);
        
        
        // Make Integer Variables of Average that is called 
        // from num1 num2 num3 num4 num5 num6 num7 num8 num9 num10
        // divided by 10. 
        int average = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10;
        
        
        // Display the Average. 
        System.out.println("The Average is: " + average);
        
        
        // Display the indications of the average based on the if else statement.
        // If the Average of a number is less than the average, it will display that it is too low. 
        // If the Average of a number is greater than the average, it will display that it is too high. 
        // if the Average of a number is matched as an Average number, it will display that it is normal, 
        // indicating that the Average number is a normal Average number as matched. 
        if (average < 40 )
        		System.out.println("The Average is: " + average);
        else if (average > 60)
        		System.out.println("Too High");
        else
        		System.out.println("Normal");
        
	}

}
````
#### LinearEquations.java
```` java
import java.util.Scanner;

public class LinearEquations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter value for x 
		System.out.print("Enter a value for x: ");
		int x = input.nextInt();
	
		// Make a blank line.
		System.out.println();
		
		// Prompt user to enter a value for y 
		System.out.print("Enter a value for y: ");
		int y  = input.nextInt();
		
		//Make a blank line
		System.out.println();
		
		// compute the answer
		int answer = ((x * x) + (x * y ) + (y * y));
		
		// Display the Result 
		System.out.println("The answer to xx + xy yy is " + answer);

	}

}
````
#### Lottery.java
```` java
import java.util.Scanner;


public class Lottery {
	
	public static void main(String[] args) {
		// Generate a Lottery. 
		
		int lottery = (int)(Math.random() * 100);
		
		// Prompt user to guess a number. 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick(two digits): ");
		int guess = input.nextInt();
		
		// Get digits from lottery
		int lotteryDigit1 = lottery /10;
		int lotteryDigit2 = lottery % 10;
		
		// Get digits from user's guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		// Print User's Lottery. 
		System.out.println("The lottery number is " + lottery);
		
		// Check the guess
		
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");
		else 
			System.out.println("Sorry, no match");
		
		

	}

}
````
#### MathDemo.java
````java

public class MathDemo {

	public static void main(String[] args) {
		// Examples on how to use the Math Function.
		
		// Use Math Function for PI. 
		System.out.println(Math.PI / 6 );
		
		// Convert Angles to Radians Example
		System.out.println(Math.toRadians(30));
		
		// Convert Radians to Angles in degrees. 
		System.out.println(Math.toDegrees(0.52));
		
		// Example of using Exponents.
		System.out.println(Math.exp(1));
		
		// Example of a logarithm
		System.out.println(Math.log(Math.E));
		
		// Example of a number raised to the power of another number.
		System.out.println(Math.pow(2, 3));
		
		// Example of a square root. 
		System.out.println(Math.sqrt(25));
		
		// Example on how to round up a number
		System.out.println(Math.ceil(12.2));
		
		// Example on how to round down a number. 
		System.out.println(Math.floor(12.2));
		
		// Example on how to get the largest number 
		System.out.println(Math.max(2, 5));
		
		// Example on how to get the smallest number
		System.out.println(Math.min(2, 5));
		
		
		
		
		
	}

}
````
#### Multiplication.java
````java

public class MultiplicationTable {

	public static void main(String[] args) {
		// Display the table heading
		System.out.println("      Multiplication Table");
		
		// Display the number title
		System.out.print("   ");
		
		// Create a for loop to repeat 9 times for the first line. 
		for (int j = 1; j <= 9; j++)
			System.out.print("  " + j);
		
		System.out.println("\n-------------------------------------------------------------------");
		
		// Print the inside of the table
		for	(int i = 1; i <= 9; i++) {
			System.out.print(i + " | ");
			for (int j = 1; j <= 9; j++) {
				// Display the product and align properly
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}

	}

}
````
#### PerimeterOfSquare.java
````java
import java.util.Scanner;

public class PerimeterOfSquare {

	public static void main(String[] args) {
		
		// Make a new variable for the length.
		int length = (int)(Math.random() * 10);
		
		// Prompt the user with a question. 
		System.out.println("What is the Perimeter of a Square. If the Length of 1 side is " + length + "?");
		
		// Create a Scanner Object 
		Scanner input = new Scanner(System.in);
		
		// Make a new variable for the perimeter.
		int perimeter = input.nextInt();
		
		// Score the User's answer. 
		if (length * 4 == perimeter)
			System.out.println("You are correct");
		else {
			System.out.println("You are incorrect");
		}
	}

}
````
#### RepeatAdditionQuiz.java
````java
import java.util.Scanner;


public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		// Make an integer variable called number 1 and number 2 
		// to get Math.Random() to search for a random number to display. 
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		// Create a Scanner Object 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user a question to answer 
		System.out.print("What is " + number1 + " + " + number2 + " ? :");
		int answer = input.nextInt();
		
		//  If the user answers a problem wrong, it will give a message to the user that the answer 
		//  and it will prompt the user the problem again. 
		while (number1 + number2 != answer) {
			System.out.print("Wrong Answer. Try Again. What is " + number1 + " + " + number2 + " ? :");
			answer = input.nextInt();
		}
		
		// If the user answers a problem correctly, 
		// it will a message to the user that the answer is correct. 
		System.out.println("You got it!");
		
	}

}
````
#### SentinelValue.java
````java
import java.util.Scanner;



public class SentinelValue {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		
		// Read the first data and prompt the user to enter an integer
		System.out.print("Enter an integer (the input ends if it is 0): ");
		int data = input.nextInt();
		
		
		// Keep reading data until the input is 0
		// If the user doesn't put a 0 as a first digit, it will keep prompting the user to enter an integer.
		// If the user does put a 0 as a first digit it will stop prompting the user to enter another integer.
		int sum = 0;
		while (data != 0) {
			sum += data;
			
			
			// Read the next data and prompt the user to enter an integer
			System.out.print("Enter an integer (the input ends if it is 0): ");
			data = input.nextInt();
		}
		
		// If the user does put a 0 as a first digit it will stop prompting the user and will display the sum. 
		System.out.println("The Sum is: " + sum);
	}

}
````
#### showCurrentTime.java
````java
public class showCurrentTime {

	public static void main(String[] args) {
		// Obtain the total milliseconds since midnight. 
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		
		// Compute the current second in the minute in the hour 
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes 
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour.
		long currentMinute = totalMinutes % 60;
		
		// Obtain the total hours 
		long totalHours = totalMinutes / 60;
		
		// Compute the current hour
		long currentHour = totalHours % 24;
		
		// Display Results 
		System.out.println("Current time is: " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
		

	}

}
````
#### SubtractionQuiz.java
````java
import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create two random numbers
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		
		// if number1 is less than number2 swap them
		if (number1 < number2)
		{
			int temp = number1;
			number1  = number2;
			number2  = temp;
			
		}
		
		// Prompt user to answer what is number 1 - number 2 
		System.out.print("What is " + number1 + " - " + number2 + " ? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if (number1 - number2 == answer)
		{
			System.out.println("You are correct!");
		}
		else 
		{
			System.out.println("Your answer is wrong. \n" + number1 + " - " + number2 + " should be " + (number1 - number2));
		}
	}

}
````
#### SubtractionQuizLoop.java
````java
import java.util.Scanner;

public class SubtractionQuizLoop {

	public static void main(String[] args) {
		// Number of Questions.
		final int NUMBER_OF_QUESTIONS = 10; 
		
		// Count the number of correct answers.
		int correctCount = 0;
		
		// Count the number of questions.
		int count = 0;
		long startTime = System.currentTimeMillis();
		
		// Output string is initially empty.
		String output = ""; 
		
		
		// Create a Scanner Object.
		Scanner input = new Scanner(System.in);
		
		
		// Generate two random single-digit integers.
		while (count < NUMBER_OF_QUESTIONS) {
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);
		
		
		
		// If number1 < number2, swap number1 with number2.
		if (number1 < number2) {
			int temp  = number1;
			number1 = number2;
			number2 = temp;
		}
		
		
		// Prompt the student to answer the question.
		System.out.print("What is " + number1 + " - " + number2 + "? ");
		
		
		// Make an integer variable called "answer" to find the answer. 
		int answer = input.nextInt();
		
		
		// Grade the answer and display the result.
		// If user answer is correct, it will display the user that the answer is correct.
		// If the user answer is incorrect, it will display the user that the answer is incorrect
		// and it will show the correct answer that the user should of answered. 
		if (number1 - number2 == answer) {
			System.out.println("You are correct!\n");
			correctCount++;
		}
		else
			System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2) + "\n");
		
		
		// Increase the count 
		count++;
		
		output += "\n" + number1 + "-" + number2 + "=" + answer + ((number1 - number2 == answer) ? " correct" : " wrong");	
	}
	
	long endTime =  System.currentTimeMillis();
	long testTime = endTime - startTime;
	
	System.out.println("Correct count is " + correctCount + "\nTest Time is: " + testTime / 1000 + " seconds\n " + output);
	
}
}
````
#### TestSum.java
````java
public class TestSum {

	public static void main(String[] args) {
		// Create a floating data point called sum.
		double  sum = 0;
		double currentValue = 1.0;
		
		for (int count=0; count <100; count++) {
			sum += currentValue;
			currentValue -= 0.01;
		}
		
		
		// Print out the loop
		System.out.println("The sum is " + sum);
		
	}

}
````
______
### Real Life Scenarios
______
#### CalculateBucketFillUpTime.java
````java
import java.util.Scanner;


public class CalculateBucketFillUpTime {

	public static void main(String[] args) {
		// Create a Scanner Object.
		Scanner input = new Scanner(System.in);
		
		// Prompt User to enter the size of the bucket in gallons 
		System.out.print("Enter the amount of bucket holds: ");
		int size = input.nextInt();
		
		// Prompt User to enter the Flow Rate 
		System.out.print("Enter the Flow Rate: ");
		int flowRate = input.nextInt();
		
		// Calculate the amount of time the bucket takes to fill up. 
		int time = size / flowRate;
		
		// Display the answer
		System.out.print("The Bucket will be filled in the following amount of minutes: " + time);
		
		

	}

}
````
#### CalculateMilesPerGallon.java
````java
import java.util.Scanner;


public class CalculateMilesPerGallon {

	public static void main(String[] args) {
		// Create a Scanner Variable 
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the amount of miles traveled. 
		System.out.print("Enter the amount of miles traveled last month: ");
		int miles = input.nextInt();
		
		// Prompt user to enter how many gallons they used. 
		System.out.print("Enter the amount of gallons used last month: ");
		int gallons = input.nextInt();
		
		// Calculate the amount of miles per gallon
		int mpg = miles / gallons;
		
		// Displays the Answer 
		System.out.print("Your Car's miles per gallon is: " + mpg);
		
		
		

	}

}
````
#### CountriesAndContinents.java
````java
import java.util.Scanner;

public class CountriesAndContinents {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner (System.in);

		// Prompt User to enter a country
		System.out.print("Enter country name: ");
		String country = input.nextLine();

		// Sort countries into continents. 

		if (country.equals("United States") || 
					country.equals("Canada")||
					country.equals("Mexico"))
					System.out.print(country + " is in North America");
		else if (country.equals("Brazil") || 
					country.equals("Colombia") ||
					country.equals("Peru")  ||
					country.equals("Chile") ||
					country.equals("Argentina")) 
				System.out.print(country + " is in South America");
		else if (country.equals("Europe") ||
					country.equals("Germany") ||
					country.equals("England") ||
					country.equals("Italy") ||
					country.equals("France") ||
					country.equals("Greece") ||
					country.equals("Norway") ||
					country.equals("Spain") ||
					country.equals("Belgium") ||
					country.equals("Switzerland"))
				System.out.print(country + " is in Europe");
		else if (country.equals("Egypt") ||
					country.equals("South Africa") ||
					country.equals("Nigeria") ||
					country.equals("Ethopia") ||
					country.equals("Libya") ||
					country.equals("Madagascar") ||
					country.equals("Morocco") ||
					country.equals("Angola") ||
					country.equals("Kenya")) 
				System.out.print(country + " is in Africa");
		else if (country.equals("China") ||
					country.equals("India") ||
					country.equals("Japan") ||
					country.equals("Sri Lanka") ||
					country.equals("South Korea") ||
					country.equals("North Korea") ||
					country.equals("Thailand") ||
					country.equals("Vietnam") ||
					country.equals("Cambodia")||
					country.equals("Nepal") ||
					country.equals("Saudi Arabia") ||
					country.equals("Bangladesh") ||
					country.equals("Maldives") ||
					country.equals("Afghanistan") || 
					country.equals("Iraq") ||
					country.equals("Syria") ||
					country.equals("United Arab Emirates") ||
					country.equals("Armenia"))
				System.out.print(country + " is in Asia");
		else 
				System.out.print("I don't know where " + country + " is. " );

		input.close();


	}

}
````
#### FutureTuition.java
````java

public class FutureTuition {

	public static void main(String[] args) {
		// Create Variable for tuition per year.
		double tuition = 10000; 
		
		// Create Variable for the year. Start with Zero.
		int year = 0;
		
		// Create a while loop that shows tuition per year. 
		while (tuition < 20000) {
			tuition = tuition * 1.07;
			year++;
		}
		
		// Print when tuition will be doubled.
		System.out.println("Tuition will be doubled in " + year + " years");
		
		// Print if tuition is not doubled.
		System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
	}

}
````
#### GuessNumber.java
````java
import java.util.Scanner;


public class GuessNumber {

	public static void main(String[] args) {
		// Create a Random Number
		int number = (int) (Math.random() * 101);
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Print out welcome and user directions. 
		System.out.println("Welcome to Guess a Number. Please guess a number from 0 to 100.");
		
		// Create a Default Answer 
		int guess = -1;
		
		// Create a While loop as long as the answer is wrong. 
		while (guess != number) {
			System.out.print("\nEnter your guess:  ");
			guess = input.nextInt();
			
			if (guess == number)
				System.out.println("Yes, the number is " + number);
			else if (guess > number)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");
		}

	}

}
````
#### LoanSchedule.java
````java
import java.util.Scanner;


public class LoanSchedule {

	public static void main(String[] args) {
		// Create two variables 
		int numOfYears;
		double loanAmount;
		double annualInterestRate;
		
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt User for Loan Amount
		System.out.print("Enter loan amount, for example 120000.95: ");
		loanAmount = input.nextDouble();
		
		// Prompt User for number of years the loan is 
		System.out.print("Enter number of years as an integer, \nfor example 5: ");
		numOfYears = input.nextInt();
		
		// Prompt User to enter the Annual Interest Rate
		System.out.print("Enter yearly interest rate, for example 8.25: ");
		annualInterestRate = input.nextDouble();
		
		// Calculate monthly interest Rate 
		double monthlyInterestRate = annualInterestRate / 1200;
			
		// Calculate the monthly payment
			double monthlyRepayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1+monthlyInterestRate), numOfYears*12)));
			
		// Create new variable
			double balance = loanAmount;
			double interest;
			double principal;
			
			
		// Print out loan information
			System.out.println("Loan Amount: " + loanAmount);
			System.out.println("Number of years: " + numOfYears);
			System.out.println("Interest rate: " + annualInterestRate + "%");
			System.out.println();
			
		// Print out monthly information
			System.out.println("Monthly Payment: " + (int) (monthlyRepayment * 100) / 100.0);
			
		// Print total payment
			System.out.println("Total Payment: " + (int) (monthlyRepayment * 12 * numOfYears * 100) / 100.0 + "\n");
			
		// Print out all monthly payments
			System.out.println("Payment#\tInterest\tPrincipal\tBalance");
			
		// Print out each monthly payment in a loop for the number of years of a loan.
			for (int i = 1; i <= numOfYears * 12; i++) {
				interest = (int) (monthlyInterestRate * balance * 100) / 100.0;
				principal = (int) ((monthlyRepayment - interest) * 100) / 100.0;
				balance = (int) ((balance - principal) * 100) / 100.0;
				System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
				
			}
			
			
	}

}
````
#### PrintCalendar.java
````java
import java.util.Scanner;



public class PrintCalendarRedo {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter year
		System.out.print("Enter the full year:  ");
		int year = input.nextInt();
		
		// Prompt user to enter the month 
		System.out.print("Enter the full month: ");
		int month  = input.nextInt();
		
		
		// Print out the month and year.
		printMonth(year, month);
	}
	
// Make new method, "printMonth"
	public static void printMonth(int year, int month) {
		printMonthTitle(year, month);
		printMonthBody(year, month);
	}
	
// Make new method called "printMonthBody"
	public static void printMonthBody(int year, int month) {
		int startDay = getStartDay(year, month);
		int daysInMonth = getNumberOfDaysInMonth(year, month);
		
		int i = 0;
		for (i = 0; i < startDay; i++) {
			System.out.print("    ");
		}
		for (i = 1; i <= daysInMonth; i++) {
			System.out.printf("%4d", i);
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}
		
		System.out.println();
	}
	
	
// Make a new method called "printMonthTitle"
	public static void printMonthTitle(int year, int month) {
		System.out.println("    " + getMonthName(month) + " " + year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

		
	}
	
// Make a new method called "getMonthName"
	public static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1: monthName = "January"; break;
		case 2: monthName = "February"; break;
		case 3: monthName = "March"; break;
		case 4: monthName = "April"; break;
		case 5: monthName = "May"; break;
		case 6: monthName = "June"; break;
		case 7: monthName = "July"; break;
		case 8: monthName = "August"; break;
		case 9: monthName = "September"; break;
		case 10: monthName = "October"; break;
		case 11: monthName = "November"; break;
		case 12: monthName = "December"; break;
		}
		return monthName;
	}

// Make a new method called "getStartDay"
	public static int getStartDay(int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		// Get total number of days from 1/1/1800 to month/1/year
		int totalNumberOfDays = getTotalNumberOfDays(year, month);
		
		// Return the start day for month/1/year
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}

// Make a new method called "getNumberOfDaysInMonth" 
	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		if (month == 2) return isLeapYear(year) ? 29 : 28;
		
		// If month is incorrect
		return 0;
	}
	
// Make new method for the Total Number of Days
	public static int getTotalNumberOfDays(int year, int month) {
		// Tell the Computer how many days in the year. 
		int total = 0;
		for (int i=1800; i < year; i++) {
			if (isLeapYear(i))
				total += 366;
			else
				total += 365;
		}
		
		for (int i = 1; i < month; i++) {
			total += getNumberOfDaysInMonth(year, i);
		}
		return total;
	}
	
// Make a new method called "isLeapYear"
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}

````
#### TestMax.java
````java

public class TestMax {

	// Create another Method called Max
	public static int max(int num1, int num2) {
		// Create result variable
		int result;
		
		// Write a conditional statement that tells which number is greater. 
		if (num1 > num2)
			result = num1;
		else
			result = num2;
		
		return result;
	}
	
	public static void main(String[] args) {
		// Create two integer variables
		int i = 5;
		int j = 2;
		
		// Call the max method
		int k = max(i, j);
		
		// Print the result.
		System.out.println("The maximum of " + i + " and " + j + " is " + k);

	}

}
````
______
### Senal Practice Folder
______
#### AdditionQuiz.java
````java
import java.util.Scanner;




public class AdditionQuiz {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input =  new Scanner(System.in);
		
		// Create a Variable for the first number
		int num1 = (int)(Math.random() * 10);
		
		// Create a Variable for the second number
		int num2 = (int)(Math.random() * 10);
		
		// Print the first addition question
		System.out.print("What is " +  num1 +  " + " + num2 + " ? ");
		
		// Create a Variable for the Answer
		int answer = input.nextInt();
		
		
		// Print if the answer is correct or not. 
		if (num1 + num2 == answer)
				System.out.println("You are Correct");
		else {
			System.out.println("You are incorrect. The correct answer is " + (num1 + num2));
		}
	}

}
````
#### DeckOfCards.java
````java
public class DeckOfCards {

	public static void main(String[] args) {

		// Make a integer called deck that contains 52 decks of cards
		int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

		//  Initialize Cards
		for (int i = 0; i < deck.length; i++)
			deck[i] = i;
		
		// Shuffle the cards
		for (int i = 0; i < deck.length; i++){

			// Generate an index randomly
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}

		// Display the first four cards
		for (int i = 0; i < 4; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number" + deck[i] + ": " + rank + " of " + suit);
		}



	}

}
````
#### Fun.java
````java
import java.util.Scanner;

public class Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create two random numbers
				int number1 = (int) (Math.random() * 10);
				int number2 = (int) (Math.random() * 10);
				
				// if number1 is less than number2 swap them
				if (number1 < number2)
				{
					int temp = number1;
					number1  = number2;
					number2  = temp;
					
				}
				
				// Prompt user to answer what is number 1 - number 2 
				System.out.println("What is " + number1 + " - " + number2 + " ? ");
				Scanner input = new Scanner(System.in);
				
				// Make the answer variable 
				int answer = input.nextInt();
				
				
				// Display if the answer is true or false 
				// True = Correct 
				// False = Not Correct. 
				System.out.println(number1 - number2 == answer);

			}

		

	}
````
#### Intro.java
````java
import java.util.Scanner;




public class Intro {

	public static void main(String[] args) {

		// Create a new Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompt the User to enter their name. For Example, Senal Bulumulle.
		System.out.print("Enter your Name: ");

		// Create a String Variable called Name.
		String name = input.nextLine();

		// Prompt the User to enter their age. 
		System.out.print("Enter your Age: ");

		// Create a String Variable called age.
		String age = input.nextLine();

		// Prints out the User's Information.
		System.out.println("Here is your information ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

}
````
#### OrderTwoCities.java
````java
import java.util.Scanner;

public class OrderTwoCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Prompts the User to enter two cities 
		System.out.print("Enter the first city: ");
		
		// Make a string variable called city1 for user to enter the first city
		String city1 = input.nextLine();
		
		// Prompt the User to enter the Second City 
		System.out.print("Enter the second city: ");
		
		// Make a string variable called city2 for user to enter the second city
		String city2 = input.nextLine();
		
		if (city1.compareTo(city2) < 0 )
			System.out.println("The cities in alphabetical order are:  " + city1 + ", " + city2);
		
		else
			System.out.println("The cities in alphabetical order are: " + city2 + ", " + city1);
		
	}

}
````
#### Palindrome.java
````java
import java.util.Scanner;



public class Palindrome {

	public static void main(String[] args) {
		// Create a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompt the User to Enter a String.
		System.out.print("Enter a String:  ");
		String s = input.nextLine();

		// The index of the First Character in the string.
		int low = 0;

		// The index of the last character in the string.
		int high = s.length() - 1;

		boolean isPalindrome = true;
		while (low < high) {
			if (s.charAt(low) != s.charAt(high)){
				isPalindrome = false;
				break;
			}
			low++;
			high--;
		}
		if (isPalindrome)
			System.out.println(s + " is a palindrome");
		else
			System.out.println(s + " is not a palindrome");
			

	}

}
````
#### SubtractionQuiz.java
````java
import java.util.Scanner;




public class SubtractionQuiz {

	public static void main(String[] args) {
		// Create a new Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Create a Variable for the first number 
		int num2 = (int)(Math.random() * 10);
		
		// Create a Variable for the second number
		int num1 = (int)(Math.random() * 10);
		
		// Print out the Question 
		System.out.print("What is " + num2 + " - " + num1 + " ? ");
		
		// Create a Variable for the answer 
		int answer = input.nextInt();
		
		// Print out the Answer
		if (num2 - num1 == answer)
			System.out.println("You are correct ");
		else {
			System.out.println("You are incorrect. The correct answer is " + (num2 - num1));
		}
	}

}
````
#### TestVoidMethod.java
````java
public class TestVoidMethod {

	public static void main(String[] args) {
		// If the Grade Number is above 78.5 Percent,
		// It will display the Grade Information. 
		System.out.print("The Grade is ");
		printGrade(78.5);

		// If the Grade Number is below 59.5 Percent,
		// It will display the Grade Information
		System.out.print("The Grade is ");
		printGrade(59.5);
	}


	public static void printGrade(double score){
		if (score >= 90.0) {
			System.out.println('A');
		}
		else if (score >= 80.0) {
			System.out.println('B');
		}
		else if (score >= 70.0) {
			System.out.println('C');
		}
		else if (score >= 60.0) {
			System.out.println('D');
		}
		else {
			System.out.println('F');
		}
	  }	
	}
````
#### zodiac.java
````java
import java.util.Scanner;
public class zodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Call Scanner to follow other parameters. 
		Scanner input = new Scanner(System.in);
		
		// The next step is to call print to prompt the user to enter the year 
		System.out.print("Enter a year: ");
		
		// Make an integer (int) named year to pass year to switch(year % 12)
		
		int year = input.nextInt();
		
		switch (year % 12) {
		case 0: System.out.println("Apple"); break;
		case 1: System.out.println("Pears"); break;
		case 2: System.out.println("Cherry"); break;
		case 3: System.out.println("Coconut"); break;
		case 4: System.out.println("Avocado"); break;
		case 5: System.out.println("Papaya"); break; 
		case 6: System.out.println("Grapefruit"); break;
		case 7: System.out.println("Apple"); break;
		case 8: System.out.println("Pear"); break;
		case 9: System.out.println("Pineapple"); break;
		case 10: System.out.println("Jackfruit"); break;
		case 11: System.out.println("Mango"); break;
		}
	}
	

}
````
______
### Writing String Code

______
#### CapitalTrivia.java
````java
import java.util.Scanner;

public class CapitalTrivia {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Prompt User to enter country name
		System.out.print("Enter Country Name: ");
		String country = input.nextLine();

		// If User inputs a Country Name, then it will display the capital of a country. 
		if (country.equals("United States"))
			System.out.print("The capital is Washington DC");
		if (country.equals("Brazil"))
			System.out.print("The capital is Brasilla");
		if (country.equals("Canada"))
			System.out.print("The capital is Ottawa");
		if (country.equals("France"))
			System.out.print("The capital is Paris");
		if (country.equals("India"))
			System.out.print("The capital is New Delhi");
		
		input.close();
		
	}
}
````
#### Chapt6Lab.java
````java
public class Chapt6Lab {

	public static void main(String[] args) {
		// "sayHello" = String Variable
		sayHello("Grumpy");
		sayHello("Happy");
		sayHello("Sleepy");
		sayHello("dwarf 4");
		sayHello("dwarf 5");
		sayHello("dwarf 6");
		sayHello("dwarf 7");

	}
	public static void sayHello (String name){
		// Displays all of the strings based on the string variable "sayHello".
		System.out.println("Hello. " + name + "!");
	}

}
````
#### chineseZodiac.java
````java
import java.util.Scanner;


public class chineseZodiac {

	public static void main(String[] args) {
		// Create a Scanner Object 
		Scanner input = new Scanner(System.in);
		
		// Prompt User to enter their birth year
		System.out.print("Enter a year:");
		int year = input.nextInt();
		
		// Assign Years to animals in multiples of 12
		switch (year % 12) {
			case 0: System.out.println("Monkey"); break;
			case 1: System.out.println("Rooster"); break;
			case 2: System.out.println("Dog"); break;
			case 3: System.out.println("Pig"); break;
			case 4: System.out.println("Rat"); break;
			case 5: System.out.println("Ox"); break;
			case 6: System.out.println("Tiger"); break;
			case 7: System.out.println("Rabbit"); break;
			case 8: System.out.println("Dragon"); break;
			case 9: System.out.println("Snake"); break;
			case 10: System.out.println("Horse"); break;
			case 11: System.out.println("Sheep"); break;
			

		
		}

	}

}
````
#### StringReverse.java
````java
import java.util.Scanner;

/* Java Program to reverse a string
 * There are two ways:
 * 1: Using customized logic
 * 2: Using standard JAVA API
 */
public class StringReverse {

	public static void main(String[] args) {
		{
			//1: Using our own logic
			// For this we will require 2 string objects
			String original; //for storing user input
			String rev = ""; // for storing reverse of string
			
			// Now let's take input from user and create scanner object
			System.out.println("Enter String to reverse: ");
			Scanner sc = new Scanner(System.in);
			original = sc.nextLine();
			
			
			// Create an integer for the string length. 
			int len = original.length();
			
			// Create a for loop for reversing a string. 
			for (int i = len -1;i>=0;i--)
				rev = rev + original.charAt(i);
			
			// Lets print both the string objects 
			System.out.println("Original string is: "+original);
			System.out.println("Reverse of string : "+rev);
			
			
		}

	}

}
````
