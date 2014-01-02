package p6_17;

public class Unitconverter {
	
	
	/**
	 * Class to convert units
	 */
	private String from;
	private String to;
	private double number;
	private final double inft = 12.0;
	private final double ftmi = 5280.0;
	private final double cmin=2.54;
	private final double mmcm = 10.0;
	private final double cmm=100.0;
	private final double mkm = 1000.0;
	
	/**
	 * @param from first unit
	 * @param to unit to be converted to
	 * @param number number of the first unit
	 */
	public Unitconverter(String from, String to, double number){
		this.from = from;
		this.to = to;
		this.number = number;
		
	}
	/**
	 * Converts and value = s the value in the new converted unit
	 * @value =  the value in the new converted unit
	 */
	public double convert(){
		
		double value = 0;
		if(from == "in" && to == "ft")
			value =  number/inft;
		else if(from == "in" && to == "mi")
			value =  (number/inft)/ftmi;
		else if(from == "in" && to == "cm")
			value =  number*cmin;
		else if(from == "in" && to == "mm")
			value =  number*cmin*mmcm;
		else if(from == "in" && to == "m")
			value =  (number*cmin)/cmm;
		else if(from == "in" && to == "km")
			value =  (number*cmin)/(cmm*mkm);
		
		else if(from == "ft" && to == "in")
			value =  number*inft;
		else if(from == "ft" && to == "cm")
			value =  number*cmin*inft;
		else if(from == "ft" && to == "mm")
			value =  number*cmin*mmcm*inft;
		else if(from == "ft" && to == "m")
			value =  (number*cmin*inft)/cmm;
		else if(from == "ft" && to == "km")
			value =  (number*cmin*inft)/(cmm*mkm);
		
		
		else if(from == "cm" && to == "in")
			value =  number/cmin;
		else if(from == "cm" && to == "ft")
			value =  (number/cmin*inft);
		else if(from == "cm" && to == "mm")
			value =  number*mmcm;
		else if(from == "cm" && to == "m")
			value =  number/cmm;
		else if(from == "cm" && to == "km")
			value =  number*cmm*mkm;
		
		else if(from == "m" && to == "in")
			value =  (number*cmm)/cmin;
		else if(from == "m" && to == "ft")
			value =  ((number*cmm)/cmin*inft);
		else if(from == "m" && to == "mm")
			value =  number*mmcm*cmm;
		else if(from == "m" && to == "cm")
			value =  number*cmm;
		else if(from == "m" && to == "km")
			value =  number/mkm;
		
		else if(from == "mm" && to == "in")
			value =  (number*mmcm*cmm)/cmin;
		else if(from == "mm" && to == "ft")
			value =  ((number*mmcm*cmm)/cmin*inft);
		else if(from == "mm" && to == "m")
			value =  number/(mmcm*cmm);
		else if(from == "mm" && to == "cm")
			value =  number/mmcm;
		else if(from == "mm" && to == "km")
			value =  number/(mmcm*cmm*mkm);
		
		else if(from == "km" && to == "in")
			value =  (number*mkm*cmm)/cmin;
		else if(from == "km" && to == "ft")
			value =  ((number*mkm*cmm)/cmin)*inft;
		else if(from == "km" && to == "m")
			value =  number*mkm;
		else if(from == "km" && to == "cm")
			value =  number*mkm*cmm;
		else if(from == "km" && to == "mm")
			value =  number*mkm*cmm*mmcm;
		
		else if(from == "mi" && to == "in")
			value =  number*ftmi*inft;
		else if(from == "mi" && to == "ft")
			value =  number*ftmi;
		else if(from == "mi" && to == "m")
			value =  (number*ftmi*inft*cmin)/cmm;
		else if(from == "mi" && to == "cm")
			value =  number*ftmi*inft*cmin;
		else if(from == "mi" && to == "mm")
			value =  number*ftmi*inft*cmin*mmcm;
		
		return value;
		
		
		
	}
}
