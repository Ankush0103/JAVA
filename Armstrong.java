/* Check if given number is Armstrong or not */
import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, n1, n2, n3, rem, res = 0;
		int digits = 0;
		System.out.println("Enter a number");
		n = sc.nextInt();
		n1 = n;
		while(n1!=0)
		{
			n1 = n1/10;
			digits++;
		}
		n2 = n;
		while(n2>0)
		{
			rem = n2%10;
			res += Math.pow(rem, digits);
			n2 = n2/10;
		}
		n3 = n;
		if(n3 == res)
		{
			System.out.println(n3 + " is Armstrong Number");
		}
		else
		{
			System.out.println(n3 + " is not Armstrong Number");
		}
	}
}
