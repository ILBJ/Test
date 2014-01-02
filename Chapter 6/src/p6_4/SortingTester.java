package p6_4;
import java.util.Scanner;
public class SortingTester {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter three numbers");
		double first = keyboard.nextDouble();
		double second = keyboard.nextDouble();
		double third = keyboard.nextDouble();
		
		Sorting example = new Sorting(first, second , third);
		System.out.println(example.sortValues());
		
		
	}
}
