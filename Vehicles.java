/*2.	Write a program to create a class named Vehicle having protected instance variables
	regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a vehicle class”.
        Inherit the Vehicle class into subclasses named Bus and Car having individual
        private instance variables routeNumber in Bus and manufacturerName in Car and both of them having showData ( )
        method showing all details of Bus and Car respectively with content of the super class’s showData ( ) method.*/

import java.util.Scanner;
class Vehicle{
    protected String regnNumber, color, ownerName;
    protected int speed;
    Vehicle(String regno, String c, String owner, int sp){
        this.regnNumber = regno;
        this.color = c;
        this.ownerName = owner;
        this.speed = sp;
    }
    public void showData(){
        System.out.println("This is vehicle class");
    }
}

class Bus extends Vehicle
{
    private int routeNumber;
    Bus(String regno, String c, String owner, int sp, int route)
    {
        super(regno, c, owner, sp);
        this.routeNumber = route;
    }
    public void showData(){
        super.showData();
        System.out.println("Reg no. : " + regnNumber);
        System.out.println("Color: " + color);
        System.out.println("Owner: " + ownerName);
        System.out.println("Speed: " + speed);
        System.out.println("Route: " + routeNumber);
    }
}
class Car extends Vehicle
{
    private String manufacturerName;
    Car(String regno, String c, String owner, int sp, String mf)
    {
        super(regno, c, owner, sp);
        this.manufacturerName = mf;
    }
    public void showData(){
        super.showData();
        System.out.println("Reg no. : " + regnNumber);
        System.out.println("Color: " + color);
        System.out.println("Owner: " + ownerName);
        System.out.println("Speed: " + speed);
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

public class Vehicles {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String regno, color, owner, manufacturer;
        int speed, route;
        int ch = 1;
        while(ch!=0)
	{
		System.out.println("Enter your choice");
		System.out.println("1. Bus: ");
		System.out.println("2. Car: ");
		System.out.println("Type 0 to exit");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				//Bus
				System.out.println("Enter bus regno: ");
				regno = sc.next();
				System.out.println("Enter bus colour: ");
				color = sc.next();
				System.out.println("Enter bus owner: ");
				owner = sc.next();
				System.out.println("Enter bus speed: ");
				speed = sc.nextInt();
				System.out.println("Enter bus route no.: ");
				route = sc.nextInt();
				Bus b = new Bus(regno, color, owner, speed, route);
				b.showData();
				break;
			case 2:
				// Car
				System.out.println("Enter car regno: ");
				regno = sc.next();
				System.out.println("Enter car color: ");
				color = sc.next();
				System.out.println("Enter car owner: ");
				owner = sc.next();
				System.out.println("Enter car speed: ");
				speed = sc.nextInt();
				System.out.println("Enter car manufacturer name: ");
				manufacturer = sc.next();
				Car c = new Car(regno, color, owner, speed, manufacturer);
				c.showData();
				break;
		}
	}
    }
}

