public class Je
{
	public static void main(String[] args)
	{
		try
		{
			// Code where exception occurs
			int data = 100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		try
		{
			String s = null;
			System.out.println(s.length()); // NullPointerException
		}
		catch(NullPointerException s)
		{
			System.out.println(s);
		}
		try
		{
			String s = "abc";
			int i = Integer.parseInt(s); // NumberFormatException
		}
		catch(NumberFormatException n)
		{
			System.out.println(n);
		}
		try
		{
			int a[] = new int[5];
			a[10] = 50; // ArrayIndexOutofBoundsException
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a);
		}
		try
		{
			int d  = 100/0;
			
		}
		catch(Exception e)
		{
			System.out.println("Can't divided by zero");// Custom messgae using catch/
		}		
		System.out.println("Rest of the code"); // It will not be printed if we don't use try-catch block
	}
}
