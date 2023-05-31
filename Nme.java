/*2.Define an exception called “NoMatchFoundException” that is thrown when a string is not equal to “University”. Write a program that uses this exception.  	*/
import java.util.Scanner;
class NoMatchFoundException extends Exception{
	NoMatchFoundException(String s){
	super(s);
	}
}
class Nme
{
	public static void Match(String s) throws NoMatchFoundException
	{
		if(s.equals("University"))
		{
			System.out.println("It matches with University");
		}
		else
		{
			throw new NoMatchFoundException("Does not match");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the required String: ");
		String s = sc.next();
		try
		{
			Match(s);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("It is implemented irrespective of wheteher exception appens or not. Clean up code to close database and file connection");
		//System.out.println("Rest of the code");
		}
	}	
}
