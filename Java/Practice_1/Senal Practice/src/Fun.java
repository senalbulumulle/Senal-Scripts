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


