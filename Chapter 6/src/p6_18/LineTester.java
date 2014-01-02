package p6_18;

public class LineTester {

	/**
	 * Tester for Line class
	 * @param args not used
	 */
	  public static void main(String[] args)
	    {
		  
	        Line line1 = new Line("x = 16",true);
	        Line line2 = new Line("y = 5.2x + 3.1");
	        Line line3 = new Line("y = 5x + 6");
	        Line line4 = new Line("y = -7x + -10");
	         
	        System.out.println(line1.equals(line2));
	        System.out.println(line1);
	        System.out.println(line2);
	        
	        System.out.println(line2.equals(line4));
	        
	        System.out.println(line2);
	        System.out.println(line4);
	        
	        System.out.println(line1.intersects(line2));
	        
	        System.out.println(line1);
	        System.out.println(line2);
	        
	        System.out.println(line1.intersects(line3));
	        
	        System.out.println(line1);
	        System.out.println(line3);
	        
	        System.out.println(line1.isParallel(line3));
	        
	        System.out.println(line1);
	        System.out.println(line3);
	        
	        System.out.println(line1.isParallel(line4));
	        
	        System.out.println(line1);
	        System.out.println(line4);
	        
	        System.out.println(line1.isParallel(line2));
	        System.out.println(line1);
	        System.out.println(line2);
	      
	    }
	}
