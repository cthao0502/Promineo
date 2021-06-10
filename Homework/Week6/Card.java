package Week6;

public class Card {

		//Q1a:  Cards class: value, name, getters and setters, describe.
		private int value;
		private String name;
		
		public Card(int newValue, String suit) {
			value = newValue;
			
				switch(newValue) {
					case 2: name = "Two";
					case 3: name = "Three";				
					case 4: name = "Four";					
					case 5: name = "Five";					
					case 6: name = "Six";					
					case 7: name = "Seven";					
					case 8: name = "Eight";						
					case 9: name = "Nine";						
					case 10: name = "Ten";						
					case 11: name = "Jack";						
					case 12: name = "Queen";						
					case 13: name = "King";
					case 14: name = "Ace";			
			
			}
			
			name += " of " + suit;
		} 
		
		//Q1a: Methods
		public void describe() {
			System.out.printf("Card: %s with value of %d\n", name, value);
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

	}


