package te.sh;
import java.util.*;
public class Sr
{
	private double side;
	public Sr(double s)
	{
		this.side = s;
	}
	public double perimeter()
	{
		return 4*side;
	}
	public double area()
	{
		return side*side;
	}
}
