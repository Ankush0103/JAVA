import java.util.Scanner;
class Equation
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a, b, c, d, m, n;
		System.out.println("Enter value of a, b, c, d, m, n respectively");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		m = sc.nextDouble();
		n = sc.nextDouble();
		System.out.println("Equation 1: " + a + "x1 +"+ b + "x2 ="+m);
		System.out.println("Equation 2: " + c + "x1 +"+d + "x2 ="+n);
		double x1 = (m*d-b*n)/(a*d-b*c);
		double x2 = (n*a-m*c)/(a*d-b*c);
		if(a*d - b*c == 0) 
		{
			System.out.println("Solution does not exist");
		}
		else
		{
			System.out.println("Value of x1: " + x1);
			System.out.println("Value of x2: " + x2);
		}
	}
}
