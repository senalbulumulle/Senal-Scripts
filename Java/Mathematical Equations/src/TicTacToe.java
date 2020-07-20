import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class TicTacToe {
	
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		// Create a multi-dimensional array 
		char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '}};
		
		// Print the gameboard
		printGameBoard(gameBoard);
		
		
		
		// Make a While Statement
		while (true) {
			// Make a new Scanner variable called scan
			Scanner scan = new Scanner(System.in);	
			
			// Prompt the user to enter their placement from 1-9
			System.out.println("Enter your placement (1-9):");
			
			int playerPos = scan.nextInt();
			
			while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPositions)) {
				System.out.println("Position taken! Enter a correct Position.");
				playerPos = scan.nextInt();
				
				}
	
			
			placePiece(gameBoard, playerPos, "player");
			
			String result = checkWinner();
			
			// Make an if-statement for "CheckWinner"
			if (result.length() > 0) {
				System.out.println(result);
				break;
			}
			
			Random rand = new Random();
			
			int cpuPos = rand.nextInt(9) + 1;
			
			while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
				cpuPos = rand.nextInt(9) + 1;
					
				}
			
			
			placePiece(gameBoard, cpuPos, "cpu");
						
			// Print the Game Board
			printGameBoard(gameBoard);	
			
			result = checkWinner();
			if (result.length() > 0) {
				System.out.println(result);
				break;
			}
		}
		
		
	}
	
	public static void printGameBoard(char[][] gameBoard) {
		// Create a for loop 
		for (char[] row : gameBoard) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
		
	}

	
	public static void placePiece(char[][] gameBoard, int pos, String user) {
		// Make a Scanner Object 
		Scanner input = new Scanner(System.in);
		
		
		// Make a Char Variable called symbol
		/* UPDATE: Instead of "char symbol = ' ' ", put "char symbol = 'X';" */
		char symbol = 'X';
		
		// Make a if-else statement to change the players
		if(user.equals("Player")) {
			symbol = 'X';
			playerPositions.add(pos);
		} 
		
		else if(user.equals("cpu")) {
			symbol = '0';
			cpuPositions.add(pos);
		}
		
		// Make Switches for entries in each square
		switch(pos) {
			case 1:
				gameBoard[0][0] = symbol;
				break;
				
			case 2:
				gameBoard[0][2] = symbol;
				break;
				
			case 3:
				gameBoard[0][4] = symbol;
				break;
				
			case 4:
				gameBoard[2][0] = symbol;
				break;
				
			case 5:
				gameBoard[2][2] = symbol;
				break;
				
			case 6:
				gameBoard[2][4] = symbol;
				break;
				
			case 7:
				gameBoard[4][0] = symbol;
				break;
				
			case 8:
				gameBoard[4][2] = symbol;
				break;
				
			case 9:
				gameBoard[4][4] = symbol;
				break;
				
			default:
				break;
			
		}
	}
	
	public static String checkWinner() {
		
		List topRow = Arrays.asList(1, 2, 3);
		List midRow = Arrays.asList(4, 5, 6);
		List botRow = Arrays.asList(7, 8, 9);
		
		List leftCol = Arrays.asList(1, 4, 7);
		List midCol = Arrays.asList(2, 5, 8);
		List rightCol = Arrays.asList(3, 6, 9);
		
		List cross1 = Arrays.asList(1, 5, 9);
		List cross2 = Arrays.asList(7, 5, 3);
		
		List<List> winning = new ArrayList<List>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(leftCol);
		winning.add(midCol);
		winning.add(rightCol);
		winning.add(cross1);
		winning.add(cross2);
		
		// Make a for-loop for a user getting any of the winning conditions
		for (List l : winning) {
			
			if (playerPositions.containsAll(l)) {
				return "Congratulations, you won!";
			}
			
			else if (cpuPositions.containsAll(l)) {
				return "CPU wins! Sorry :(";
			}
			
			else if (playerPositions.size() + cpuPositions.size() == 9) {
				return "TIE";
			}
		}
		
		return "";
	}
}