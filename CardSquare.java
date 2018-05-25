public class CardSquare extends Square {

	private Deck deck;

	public CardSquare(Deck deck) {
	
		super(deck.getTitle());
		
		this.deck = deck;
	
	}

}