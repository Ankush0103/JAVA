package te.sh;
import java.util.*;
public class Cl
{
	private double radius;
	public Cl(double r)
	{
		this.radius = r;
	}
	public double perimeter()
	{
		return 2*3.14*radius;
	}
	public double area()
	{
		return 3.14*radius*radius;
	}
}
