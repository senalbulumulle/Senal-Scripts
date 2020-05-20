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
