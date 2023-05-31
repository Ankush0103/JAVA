/*1.Write a program called Factorial.java that computes factorials and catches the result in an array of type long for reuse. The long type of variable has its own range. For example 20! Is as high as the range of long type. So check the argument passed and “throw an exception”, if it is too big or too small. If x is less than 0 throw an IllegalArgumentException with a message 
“Value of x must be positive”. If x is above the length of the array throw an IllegalArgumentException with a message “Result will overflow”. Here x is the value for which we want to find the factorial.*/
import java.util.Scanner;
class Ime
{
	public static void Factorial(long n)
	{
		if(n<0)
			throw new IllegalArgumentException("n must be positive");
		else if(n>20)
			throw new IllegalArgumentException("n must be less than 20");
		else
		{
			long fact = 1;
			for(long i = 1; i<n; i++)
			{
				fact = fact*n;
				//long factorial = fact;
			}
			System.out.println("Factorial of n: " + fact);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		try
		{
			Factorial(num);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//System.out.println("Rest of the code");
	}
}
