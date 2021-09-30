package Week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
	
	//Q1b: Deck: cards, shuffle, draw, when a new Deck is instantiated, the Cards field should be populated with standard 52 cards.
public class Deck {
	List<Card> cards = new ArrayList<Card>();
	List<String> suits = Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades");
	
	public Deck() {
		for (int i = 2; i < 15; i++) {
			for (String suit : suits) {
				cards.add(new Card(i, suit));
			}
		}
	}
	
	//Q1b: Methods
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public Card draw() {
		return cards.remove(0);
	}
}
