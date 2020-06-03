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
		
	}
	
	
// Make a new method called "printMonthTitle"
	public static void printMonthTitle(int year, int month) {
		System.out.println(getMonthName(month) + " " + year);
		
		
	}
	
// Make a new method called "getMonthName"
	public static String getMonthName(int month) {
		
	}

// Make a new method called "getStartDay"
	public static int getStartDay(int year, int month) {
		
	}

// Make a new method called "getNumberOfDaysInMonth" 
	public static int getNumberOfDaysInMonth(int year, int month) {
		
	}
	
// Make a new method called "isLeapYear"
	public static boolean isLeapYear(int year) {
		
	}
}
