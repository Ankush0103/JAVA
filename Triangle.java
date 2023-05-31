import java.util.Scanner;
class Triangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides of triangle");
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		if(a<=0||b<=0||c<=0)
		{
			System.out.println("Triangle is not valid");
		}
		else if((a+b<c)||(b+c<a)||(c+a<b))
		{
			System.out.println("Triangle is not valid");
		}
		else if((a+b<c)||(b+c<a)||(c+a<b))
		{
			System.out.println("Triangle is not valid");
		}
		else if ((a==b)&&(b==c)&&(c==a))
		{
    			System.out.println("Equilateral Triangle");
		}
		else if ((a==b)||(b==c)||(c==a))
    		{
    			System.out.println("Isosceles Triangle");
		}
		else if ((a*a + b*b == c*c) || (a*a + c*c == b*b) || (c*c + b*b == a*a))
    		{
    			System.out.println("Right Triangle");
		}
		else
    		{
    			System.out.println("Scalene Triangle");
		}
		System.out.println("Area: " + area);
	}
} 
