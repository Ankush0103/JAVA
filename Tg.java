package te.sh;
import java.util.*;
public class Tg
{
	private double side1, side2, side3;
	public Tg(double s1, double s2, double s3)
	{
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	public double perimeter()
	{
		return side1+side2+side3;
	}
	public double area()
	{
		double s = (side1+side2+side3)/2;
		return Math.abs(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
	}
}
