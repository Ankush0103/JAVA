/*2.	Write a program to sort a list of strings using multithreading. Create one of the threads that take a string as input from the user, another thread that sorts the strings and finally another thread that displays the sorted list of strings*/
import java.util.*;
class Input extends Thread
{
	public void run()
	{
		System.out.println("Enter number of strings");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] slist = new String[n];
		for(int i = 0; i<n; i++)
		{
			System.out.println("Enter string " + (i+1) + " : ");
			String s = sc.next();
			slist[i] = s;
		}
		Sort s1 = new Sort(n, slist);
		s1.start();
	}
}

class Sort extends Thread
{
	int n;
	String slist[];
	Sort(int n, String[] slist)
	{
		this.n = n;
		this.slist = slist;
	}
	public void run()
	{
		Arrays.sort(slist);
		Display d = new Display(n, slist);
		d.start();
	}
}

class Display extends Thread
{
	int n;
	String slist[];
	String s1;
	Display(int n, String[] slist)
	{
		this.n = n;
		this.slist = slist;
	}
	public void run()
	{
		System.out.println("Final sorted string is ");
		for(int i = 0; i<n; i++)
		{
			s1=slist[i];
			System.out.println(s1+" ");
		}
	}
}
class Thsort
{
	public static void main(String[] args)
	{
		Input i1 = new Input();
		i1.start();
	}
}
