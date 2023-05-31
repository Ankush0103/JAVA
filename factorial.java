import java.util.Scanner;
class factorial
{
	public static void main(String[] args)
	{
		int fact = 1, i, factorial;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(i = 1; i<=n; i++)
		{
			fact = fact*i;
		}
		// factorial = fact;
		System.out.println(fact);
	}
} 
