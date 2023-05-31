/*1.	Write multithreaded program that continuously prints the strings “ping” and “PONG” in the console at random distances at intervals of one second. Use two threads one for “ping” and another for “PONG”.*/
import java.util.*;
class ping extends Thread
{
	public void run()
	{
		Random r = new Random();
		while(true)
		{
			int l = r.nextInt(100);
			for(int i = 1; i<=l; i++)
			{
				System.out.print(" ");
			}
			System.out.println("ping");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);		
			}
		}	
	}
}

class Pong extends Thread
{
	public void run()
	{
		Random r = new Random();
		while(true)
		{
			int l = r.nextInt(100);
			for(int i = 1; i<=l; i++)
			{
				System.out.print(" ");
			}
			System.out.println("PONG");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);		
			}
		}
	}
}

public class PingPong
{
	public static void main(String[] args)
	{
		ping obj1 = new ping();
		Pong obj2 = new Pong();
		obj1.start();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
		
		}
		obj2.start();
	}
}


