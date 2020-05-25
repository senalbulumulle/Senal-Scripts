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
