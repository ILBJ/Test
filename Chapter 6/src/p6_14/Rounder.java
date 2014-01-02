package p6_14;

public class Rounder {

	/**
	 * Program that tests to see if values are equal when rounded to two decimal places
	 */
	
	private double firstnumber;
	private double secondnumber;
	
	/**
	 * @param a first value
	 * @param b second value
	 */
	public Rounder(double a, double b){
		firstnumber = a;
		secondnumber = b;
	}
	
	/**
	 * Rounds the values to two decimal places and returns if the values are the same when rounded to two decimal places
	 * @return if the values are the same when rounded to two decimal places
	 */
	public boolean areClose(){
		firstnumber = Math.round(firstnumber*100.0)/100.0;
		secondnumber = Math.round(secondnumber*100.0)/100.0;
		
		if (firstnumber == secondnumber)
			return true;
		else
		return false;
	}
	
}
