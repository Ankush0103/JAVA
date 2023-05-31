/*2.Create three interfaces, each with two methods. Inherit a new interface from the three, adding a
    new method. Create a class by implementing the new interface and also inheriting from a concrete
    class. Now write four methods, each of which takes one of the four interfaces as an argument. In 
    main( ), create an object of your class and pass it to each of the methods*/
/*Create three interfaces, each with two methods. Inherit a new interface from the three, adding a
    new method. Create a class by implementing the new interface and also inheriting from a concrete
class. Now write four methods, each of which takes one of the four interfaces as an argument. In
        main( ), create an object of your class and pass it to each of the methods*/

interface sam1
{
	void meth1();
	void meth2();
}
interface sam2
{
	void meth3();
	void meth4();
}
interface sam3
{
	void meth5();
	void meth6();
}

interface sam4 extends sam1, sam2, sam3 
{
	void meth7();	
}
class Concrete
{
}
class Sample extends Concrete implements sam4
{
	public void meth1()
	{
		System.out.println("Method 1");
	}
	public void meth2()
	{
		System.out.println("Method 2");
	}
	public void meth3()
	{
		System.out.println("Method 3");
	}
	public void meth4()
	{
		System.out.println("Method 4");
	}
	public void meth5()
	{
		System.out.println("Method 5");
	}
	public void meth6()
	{
		System.out.println("Method 6");
	}
	public void meth7()
	{
		System.out.println("Method 7");
	}
}	
class Int
{
	public static void a1(sam1 m1)
	{
		m1.meth1();
		m1.meth2();
	}
	public static void a2(sam2 m2)
	{
		m2.meth3();
		m2.meth4();
	}
	public static void a3(sam3 m3)
	{
		m3.meth5();
		m3.meth6();
	}
	public static void a4(sam4 m4)
	{
		m4.meth7();
	}
	public static void main(String[] args)
	{
		Sample sp = new Sample();
		a1(sp);
		a2(sp);
		a3(sp);
		a4(sp);
	}					
}	
