
public class MindGameCard {
	
	private char value;
	private boolean guess = false;
	
	public MindGameCard(char value) {
		
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public boolean isGuess() {
		return guess;
	}

	public void setGuess(boolean guess) {
		this.guess = guess;
	}
}
