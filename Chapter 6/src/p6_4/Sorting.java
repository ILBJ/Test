package p6_4;

public class Sorting {

	private Double first;
	private Double second;
	private Double third;
	
	public Sorting(Double a, Double b, Double c){
		first = new Double (a);
		second = new Double (b);
		third = new Double(c);
	}
	
	public void swap(Double d, Double e){
		Double temp = d;
		d = e.doubleValue();
		e = temp.doubleValue();
	}
	
	public String sortValues(){
			if (first > second){
				Double temp = first;
				first = second;
				second = temp;
			  
			}
			if (second > third){
				Double temp = second;
				second = third;
				third = temp;
			   
			}
			if (first > second){
				Double temp = first;
				first = second;
				second = temp;
			  
			}
			return first + "\n" + second + "\n" + third;
	}
}
	
