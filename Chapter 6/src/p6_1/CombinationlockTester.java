package p6_1;
import java.util.Scanner;
public class CombinationlockTester {
	 
/**
 * Tester program for Combinationlock class	
 * @param args not used
 */

	  public static void main(String[] args) {
	
	    Scanner keyboard = new Scanner(System.in);
	    System.out.println("Please enter the first letter");
	    String first = keyboard.nextLine();
	    System.out.println("Please enter the second letter");
	    String second = keyboard.nextLine();
	    System.out.println("Please enter the third letter");
	    String third = keyboard.nextLine();
	    
	    String combination = first.concat(second.concat(third));
	    
	    Combinationlock example = new Combinationlock(combination);
	    
	    example.dial("A");
	    example.dial("B");
	    example.dial("C");
	    
	    example.unlock();
	    
	    
	    if (example.isOpen())
	    System.out.println("Locker is unlocked.");
	    else
	    	 System.out.println("Locker is locked.");
	    

	  }
	}

