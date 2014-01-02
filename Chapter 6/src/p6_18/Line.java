package p6_18;
import java.awt.geom.Point2D;

/** 
 * @author 174576 and Akshay Mehta
 * Program to show functions between lines
 */
public class Line
{
	public Point2D.Double point;
	public double slope;

	
	public Line(Point2D.Double a, double m)
	{
		point = a;
		slope = m;
	}

	public Line(Point2D.Double a, Point2D.Double b)
	{
		point = a;
		slope = (a.y - b.y) / (a.x - b.x);
	}

	public Line(String equation)
	{
		this(equation, false);
	}

	public Line(String equation, boolean vertical)
	{
		if(vertical)
		{
			slope = Double.POSITIVE_INFINITY;
			point = new Point2D.Double(Double.parseDouble(equation.substring(4)), 0);
		} else {
			slope = Double.parseDouble(equation.substring(4, equation.indexOf('x')));
			point = new Point2D.Double(0, Double.parseDouble(equation.substring(equation.indexOf('+') + 2)));
		}
	}
	

	public boolean isParallel(Line line)
	{
		return slope == line.slope;
	}

	public boolean intersects(Line line)
	{
		return !isParallel(line);
	}

	public boolean equals(Line line)
	{
		return getYIntercept() == line.getYIntercept() && slope == line.slope;
	}

	private double getYIntercept()
	{
		return Math.round((point.y - point.x * slope) * Math.pow(10, 12)) / Math.pow(10, 12);
	}

	public String toString()
	{

		return slope != Double.POSITIVE_INFINITY ? "y = " + slope + "x + " + getYIntercept() : "x = " + point.x;
	}
}