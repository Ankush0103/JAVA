// Thread is implemented by 2 ways
// By extending thread class or by implementing runnable interface.
class Single extends Thread
{
	public void run()
	{
		/*for(int i = 1; i<=5; i++)
		{
			Thread t = currentThread();
			System.out.println("Thread Status: "+ t.isAlive());
			try
			{
				t.sleep(1000); // t1.sleep gives error since it has no scope.
			}
			catch(Exception e)
			{
			}
			System.out.println(i);
		
		}*/
	}
}

class Th
{
	public static void main(String[] args)
	{
		Single t1 = new Single();
		Single t2 = new Single();
		System.out.println("Thread ID " + t1.getId());
		System.out.println("Thread name " + t1.getName());
		t1.setName("Ankur");
		System.out.println("Thread name " + t1.getName());
		System.out.println("Thread priority " + t1.getPriority());
		t1.setPriority(2);
		System.out.println("Thread priority " + t1.getPriority());
		t1.start(); // Implicitly calls run method.
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
		}
		
		System.out.println("Thread1 Status: "+ t1.isAlive());
		t2.start();
	}
}
		
