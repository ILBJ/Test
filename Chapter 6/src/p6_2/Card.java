package p6_2;

public class Card {

	private String cardvalue;
	private String cardsuit;
	
	public Card(String value, String suit){
				switch(suit.toUpperCase()){
					case "D" : cardsuit = "Dimaonds";
								break;
					case "H": cardsuit = "Hearts";
								break;
					case "S" : cardsuit = "Spades";
								break;
					case "C": cardsuit = "Clubs";
								break;
					default: cardsuit = "Invalid card suit";
	}
				switch(value.toUpperCase()){
				case "1": cardvalue = "One";
							break;
				case "2": cardvalue = "Two";
							break;
				case "3": cardvalue = "Three";
							break;
				case "4": cardvalue = "Four";
							break;
				case "5": cardvalue = "Five";
							break;
				case "6": cardvalue = "Six";
							break;
				case "7": cardvalue = "Seven";
							break;
				case "8": cardvalue = "Eight";
							break;
				case "9": cardvalue = "Nine";
							break;
				case "10": cardvalue = "Ten";
							break;
				case "J": cardvalue = "Jack";
							break;
				case "Q": cardvalue = "Queen";
							break;
				case "K": cardvalue = "King";
							break;
				case "A": cardvalue = "Ace";
							break;
				default: cardvalue = "Invalid card value";
							break;
				
				}
				
					
				}
	
				public String getDescription(){
					return cardvalue + " of " + cardsuit; 
	
}
}
