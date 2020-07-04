import java.util.Calendar;
import java.util.GregorianCalendar;




public class Greeting {

	public static void main(String[] args) {
		
		// Make a new time variable 
		GregorianCalendar time = new GregorianCalendar();
		
		// Create 5 int variables for hour, min, day, month, year.
		int hour = time.get(Calendar.HOUR_OF_DAY);
		int min  = time.get(Calendar.MINUTE);
		int day  = time.get(Calendar.DAY_OF_MONTH);
		int month = time.get(Calendar.MONTH);
		int year  = time.get(Calendar.YEAR);
		
		// Make an if-else statement for greeting 
		if (hour < 12)
			System.out.println("Good Morning!");
		else if (hour < 17 && !(hour == 12))
			System.out.println("Good Afternoon");
			
		else
			System.out.println("Good Evening");
		
		// Display the Date
		System.out.println("Today's date is: \t" + month + "/" + day + "/" + year);
		
		// Display the Time
		System.out.println("The current time is \t" + hour + ":" + min);
	}

}
