package p6_16;
import java.util.Scanner;
public class PayCheckTester {

	/**
	 * Tester for PayCheck class
	 * @param args not used
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Document THIS CODE
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the employee's name, hourly wage, and hours worked this week");
		String name = keyboard.nextLine();
		Double hourlywage = keyboard.nextDouble();
		Double hoursworked = keyboard.nextDouble();
		PayCheck example = new PayCheck(name,hourlywage,hoursworked);
		System.out.println(name + " has earned $" + example.getPay());
	}

}
