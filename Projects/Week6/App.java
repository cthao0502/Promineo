package Week6;

public class App {

	public static void main(String[] args) {
		
		//Q2: Create a class called App
		//Q3: Instantiate a deck and two players, call the shuffle method on the deck.
		Deck deck = new Deck();
		Player player1 = new Player("1");
		Player player2 = new Player("2");
		deck.shuffle();
		
		//Q4: Use traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck.
			for (int i = 0; i < 52; i++) {
				if(i % 2 == 0) {
					player1.draw(deck);
				} else {
					player2.draw(deck);
				}
			}
			
		//Q5a: Use traditional for loop, iterate 26 times and call the flip method for each player.  Compare the value of each card
		//returned by the two player's flip method.  Call the incrementScore method on player who's card is higher.
			for(int i = 0; i < 26; i++) {
				Card player1Card = player1.flip();
				Card player2Card = player2.flip();
				if(player1Card.getValue() > player2Card.getValue()) {
					player1.incrementScore();
				} else if (player1Card.getValue() < player2Card.getValue()) {
					player2.incrementScore();
				}
			}
		
		//Q6: After loop, compare the final score from each player.
		//Q7: Print the final  score of each player and either "Player 1", "Player 2", or "Draw" depending on which score is higher or if they both are the same.
		System.out.printf("Player 1 drew a %d. \n", player1.getScore());
		System.out.printf("Player 2 drew a %d. \n", player2.getScore());
		if(player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 is the winner!!");
		}else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 is the winner!!");
		}else {
			System.out.println("We have a DRAW!");
		}
	}

}
