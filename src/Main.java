import java.util.Scanner;

public class Main {
	
	private static MindGameCard[][] gameCards = new MindGameCard[4][4];

	public static void main(String[] args) {
		
		gameCards[0][0] = new MindGameCard('A');
		gameCards[0][1] = new MindGameCard('B');
		gameCards[0][2] = new MindGameCard('D');
		gameCards[0][3] = new MindGameCard('C');
		gameCards[1][0] = new MindGameCard('H');
		gameCards[1][1] = new MindGameCard('F');
		gameCards[1][2] = new MindGameCard('E');
		gameCards[1][3] = new MindGameCard('J');
		gameCards[2][0] = new MindGameCard('F');
		gameCards[2][1] = new MindGameCard('D');
		gameCards[2][2] = new MindGameCard('J');
		gameCards[2][3] = new MindGameCard('A');
		gameCards[3][0] = new MindGameCard('B');
		gameCards[3][1] = new MindGameCard('H');
		gameCards[3][2] = new MindGameCard('C');
		gameCards[3][3] = new MindGameCard('E');
		
		while(gameOver() == false) {
			
			gameBoard();
			guess1();
		}
	}
	
	public static void guess1(){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("First Guess: ");
		int i1 = scanner.nextInt();
		int j1 = scanner.nextInt();
		
		gameCards[i1][j1].setGuess(true);
		gameBoard();
		
		System.out.print("Second Guess: ");
		int i2 = scanner.nextInt();
		int j2 = scanner.nextInt();
		
		if (gameCards[i1][j1].getValue() == gameCards[i2][j2].getValue()) {
			
			System.out.println("Correct guess. Congratulations...");
			gameCards[i2][j2].setGuess(true);
		}
		else {
			
			System.out.println("Wrong guess!");
			gameCards[i1][j1].setGuess(false);
		}
		
	}
	
	public static boolean gameOver() {
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				
				if(gameCards[i][j].isGuess() == false) {
					
					return false;
				}
			}
		}
		return true;
		
	}
	
	public static void gameBoard() {
		
		for(int i = 0; i < 4; i++) {
			System.out.println("___________________");
			for(int j = 0; j < 4; j++) {
				
				if (gameCards[i][j].isGuess()) {
					
					System.out.print(" |" + gameCards[i][j].getValue() + " |");	
				}
				else {
					
					System.out.print(" | | ");
				}
			}
			
			System.out.println("  ");
		}
		
		System.out.println("___________________");	
	}
}
