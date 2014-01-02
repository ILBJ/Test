package p6_2;
import java.util.Scanner;
public class CardTester {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the card notation");
		String card = keyboard.nextLine();
		
		
		Card example = new Card(card.substring(0, card.length()-1), card.substring(card.length()-1));
		System.out.println(example.getDescription());
	
		
	}

}
