// Creating a Thread
class Mt extends Thread
{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String[] args)
	{
		Mt t1 = new Mt();
		t1.start();
	}
}
// By implementing multiple interface
/*class Multi3 implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
Multi3 m1=new Multi3();  
Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
t1.start();  
 }  
}*/  

//Using the Thread Class: Thread(String Name)
/*public class MyThread1  
{  
public static void main(String argvs[])  
{  
// creating an object of the Thread class using the constructor Thread(String name)   
Thread t= new Thread("My first thread");  
t.start();  
// getting the thread name by invoking the getName() method  
String str = t.getName();  
System.out.println(str);  
}  
}  */

// Using the Thread Class: Thread(Runnable r, String name)
/*public class MyThread2 implements Runnable  
{    
public void run()  
{    
System.out.println("Now the thread is running ...");    
}    
    
// main method  
public static void main(String argvs[])  
{   
// creating an object of the class MyThread2  
Runnable r1 = new MyThread2();   
Thread th1 = new Thread(r1, "My new thread");      
th1.start();   
  
// getting the thread name by invoking the getName() method  
String str = th1.getName();  
System.out.println(str);  
}    
}    */
