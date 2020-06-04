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
