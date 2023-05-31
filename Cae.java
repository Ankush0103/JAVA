/*Create an user defined exception named Check Argument to check the number
of arguments passed through command line. If the number of arguments is less
than five, throw the CheckArgumentexception, else print the addition of all five
numbers. */

import java.util.Scanner;
class CheckArgumentException extends Exception{
	CheckArgumentException(String s){
	super(s);
	}
}
class Nme
{
	public static void Match(args[]) throws CheckArgumentException
	{
		int sum = 0;
		if(args.length<5)
		{
			throw new CheckArgumentException("Exception Occur");
		}
		else
		{
			System.out.println("No excepion");
			for(int i = 0; i<5; i++)
				sum += Integer.parseInt(args[i]);
			System.out.println(sum);
		}
	}
	public static void main(String[] args)
	{
		
		try
		{
			Match(args[]);
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
