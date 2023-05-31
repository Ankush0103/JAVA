package org.shapes;
public class Triangles
{
	private double side1, side2, side3;
	public Triangles(double s1, double s2, double s3)
	{
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	public double perimeter()
	{
		return side1 + side2 + side3;
	}
	public double area()
	{
		double s = (side1 + side2 + side3)/2;
		double a = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return Math.abs(a);
	}
}
