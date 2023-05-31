package org.shapes;
public class Square
{
	private double side;
	public Square(double s)
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

