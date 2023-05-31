class Single implements Runnable
{
	public void run()
	{
		for(int i = 0; i<=5; i++)
			System.out.println(i);
	}
}

class Thr
{
	public static void main(String[] args)
	{
		Single t = new Single();
		Thread th = new Thread(t); // Passing t in thread class.
		th.start();
	}
}
