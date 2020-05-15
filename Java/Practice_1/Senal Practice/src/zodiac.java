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
