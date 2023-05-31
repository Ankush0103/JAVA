import org.shapes.*;
import static org.input.Q.*;
import java.util.Scanner;

public class S7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Side of Square: ");
		double s = Value();
		Square sq = new Square(s);
		System.out.println("Perimeter of Square: " + sq.perimeter());
		System.out.println("Area of Square: " + sq.area());
		System.out.println("Side of Circle: ");
		double c = Value();
		Circle ci = new Circle(c);
		System.out.println("Perimeter of Circle: " + ci.perimeter());
		System.out.println("Area of Circle: " + ci.area());
		System.out.println("Side of Triangle: ");
		double t1 = Value();
		double t2 = Value();
		double t3 = Value();
		Triangles ti = new Triangles(t1, t2, t3);
		System.out.println("Perimeter of Triangle: " + ti.perimeter());
		System.out.println("Area of Triangle: " + ti.area());
	}
}
