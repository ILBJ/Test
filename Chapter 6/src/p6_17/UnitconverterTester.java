package p6_17;
import java.util.Scanner;
public class UnitconverterTester {

	/**
	 * Tester for Unitconverter
	 * @param args not used
	 */
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Convert from?");
	String from = keyboard.nextLine();
	System.out.println("Convert to?");
	String to = keyboard.nextLine();
	System.out.println("Value?");
	double number = keyboard.nextDouble();
	
	Unitconverter example = new Unitconverter(from,to,number);
	System.out.println(number + " " + from + " = " + example.convert() + to);
		

	}

}
