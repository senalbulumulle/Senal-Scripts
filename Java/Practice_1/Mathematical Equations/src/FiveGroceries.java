import java.util.Scanner;



public class FiveGroceries {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt the User to input the cost of each item.
		System.out.print("Enter the cost of the first item: ");
		
		
		// Make a double variable for item 1 
		double item1 = input.nextDouble();
		
		// Prompt the User to input the cost of the second item.
		System.out.print("Enter the cost of the second item: ");
		
		
		// Make a double variable for item 2
		double item2 = input.nextDouble();
		
		// Prompt the User to input the cost of the third item
		System.out.print("Enter the cost of the third item: ");
		
		// Make a double variable for item 3 
		double item3 = input.nextDouble();
		
		// Prompt the User to input the cost of the fourth item
		System.out.print("Enter the cost of the fourth item: ");
		
		// Make a double variable for item 4 
		double item4 = input.nextDouble();
		
		// Prompt the User to input the cost of the fifth item
		System.out.print("Enter the cost of the fifth item: ");
		
		// Make a double variable for item 5
		double item5 = input.nextDouble();
		
		
		
		// Create a total cost variable using a double 
		double totalCost = item1 + item2 + item3 + item4 + item5;
		
		// Prompt the user the total cost of the item (s)
		System.out.println("This total cost is $" + totalCost);
	}

}
