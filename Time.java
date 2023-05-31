/*Create a class called Time, which has three instance variables – hour, min and sec. It contains a
method called add ( ) which takes one Time object as parameter and print the added value of the
calling Time object and passed Time object. In the main method, declare two Time objects and
assign values using constructor and call the add ( ) method.*/
import java.util.Scanner;
class Time
{
	public int hour, min, sec;
	public Time(int h, int m, int s)
	{
		this.hour = h;
		this.min = m;
		this.sec = s;
	}
	
	Time()
	{
		hour = 0;
		min = 0;
		sec = 0;
	}
	
	public Time add(Time tx)
	{
		Time t = new Time();
		t.sec += this.sec + tx.sec;
		if(t.sec>=60)
		{
			t.sec-=60;
			t.min++;
		}
		t.min += this.min + tx.min;
		if(t.min>=60)
		{
			t.min-=60;
			t.hour++;
		}
		t.hour += this.hour + tx.hour;
		if(t.hour>=24)
		{
			t.hour-=24;
		}
		return t;
	}
	
	public void display(String str)
	{
		System.out.println(str+" "+hour+":"+min+":"+sec);
	} 
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour for t1: ");
		int a = sc.nextInt();
		System.out.println("Enter min for t1: ");
		int b = sc.nextInt();
		System.out.println("Enter sec for t1: ");
		int c = sc.nextInt();
		System.out.println("Enter hour for t2: ");
		int d = sc.nextInt();
		System.out.println("Enter min for t2: ");
		int e = sc.nextInt();
		System.out.println("Enter sec for t2: ");
		int f = sc.nextInt();
		Time t1 = new Time(a, b, c);
		Time t2 = new Time(d, e, f);
		Time t3 = t1.add(t2);
		t1.display("Time t1: ");
		t2.display("Time t2: ");
		t3.display("Time after adding two times: ");
	}
}
	
		
	
	
	
	
