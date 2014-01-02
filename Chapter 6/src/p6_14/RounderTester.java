package p6_14;
import java.util.Scanner;
public class RounderTester {

	/**
	 * Tester for Rounder class
	 * @param args not used
	 */
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter two floating-point numbers");
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		Rounder example = new Rounder(a,b);
		
		if (example.areClose())
			System.out.println("The numbers are the same after rounding to two decimal places");
		else
			System.out.println("The numbers are not the same after rounding to two decimal places");

	}

}
