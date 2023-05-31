import te.sh.Sr;
import te.sh.Cl;
import te.sh.Tg;
import static te.in.io.*;
import java.util.*;
public class Frp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Square 2. Circle 3. Triangle 4.Exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter side of square");
					double s = Value();
					Sr sq = new Sr(s);
					System.out.println("Perimeter of Square: " + sq.perimeter());
					System.out.println("Area of Square: " + sq.area());
					break;
				case 2:
					System.out.println("Enter side of circle");
					double r = Value();
					Cl ci = new Cl(r);
					System.out.println("Perimeter of Circle: " + ci.perimeter());
					System.out.println("Area of Cirlce: " + ci.area());
					break;
				case 3:
					System.out.println("Enter side of triangle");
					double s1 = Value();
					double s2 = Value();
					double s3 = Value();
					Tg ti = new Tg(s1, s2, s3);
					System.out.println("Perimeter of Triangle: " + ti.perimeter());
					System.out.println("Area of Triangle: " + ti.area());
					break;
				case 4:
					System.out.println("Exiting the program");
					System.exit(0);
					break;
				default:
					System.out.println("Enter correct choice");
			}
		}
		
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

