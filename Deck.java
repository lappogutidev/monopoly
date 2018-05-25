import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> deck = new ArrayList<Card>();
	private String title;
	
	public Deck(Card[] deck, String title) {
	
		this.title = title;
		
		for (Card newCard : deck) {
		
			this.deck.add(newCard);
			
		}
	
	}
	
	public String getTitle() {
	
		return title;
		
	}

}