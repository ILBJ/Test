package p6_16;

public class PayCheck {

	/**
	 * Program that calculates an employee's pay
	 */
	
	private String name;
	private double hourlywage;
	private double hoursworked;
	private final double minhoursbeforeovertime = 40;
	
	/**
	 * @param name name of employee
	 * @param hourlywage wage per hour of the employee
	 * @param hoursworked hours worked in the week
	 */
	public PayCheck(String name, double hourlywage, double hoursworked){
		this.name = name;
		this.hourlywage = hourlywage;
		this.hoursworked = hoursworked;
	}
	
	/**
	 * calculates and returns the pay the employee earned in the week including overtime
	 * @return the pay the employee earned that week
	 */
	public double getPay(){
		if (hoursworked <= 40)
			return hourlywage*hoursworked;
		else
			return (minhoursbeforeovertime*hourlywage) + ((hoursworked-40)*(1.5*hourlywage));
	}
}
