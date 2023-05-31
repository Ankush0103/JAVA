/*1.	Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle and Square.
        Use Quadrilateral as the super class of the hierarchy. The instance variables of Quadrilateral
        should be the x-y coordinate pairs for the four endpoints of the Quadrilateral.
        Write a program that instantiates objects of your classes and outputs each object's area (except Quadrilateral).*/
import java.util.Scanner;
class QuadrilateralImp {
    public int x1, x2, x3, x4, y1, y2, y3, y4;

    public void setCoordinate(int a, int b, int c, int d, int e, int f, int g, int h) {
        this.x1 = a;
        this.y1 = b;
        this.x2 = c;
        this.y2 = d;
        this.x3 = e;
        this.y3 = f;
        this.x4 = g;
        this.y4 = h;
    }
}

class Square1 extends QuadrilateralImp{
    Square1(int a, int b, int c, int d, int e, int f, int g, int h){
        setCoordinate(a,b,c,d,e,f,g,h);
    }
    int area(){
        int d = (int)Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        return Math.abs(d*d);
    }
}

class Rectangle2 extends QuadrilateralImp{
    Rectangle2(int a, int b, int c, int d, int e, int f, int g, int h){
        setCoordinate(a,b,c,d,e,f,g,h);
    }
    int area(){
        int d1 = (int)Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        int d2 = (int)Math.sqrt((x1-x4)*(x1-x4) + (y1-y4)*(y1-y4));
        return d1*d2;
    }
}

class Parallelogram extends QuadrilateralImp{
    Parallelogram(int a, int b, int c, int d, int e, int f, int g, int h){
        setCoordinate(a,b,c,d,e,f,g,h);
        
    }
    int area(){
        int d1 = (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return Math.abs(d1*(y4-y1));
    }
}

class Trapezium extends QuadrilateralImp{
    public int height;
    Trapezium(int a, int b, int c, int d, int e, int f, int g, int h){
        setCoordinate(a,b,c,d,e,f,g,h);
        
    }
    int area(){
        int d1 = (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        int d2 = (int)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
        return Math.abs((int)(((d1+d2)*(y4-y1))/2));
    }
}

class Quadrilateral{
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
       	while(true)
       	{
       		
       		System.out.println("Enter your choice: ");
       		System.out.println("1. Square");
       		System.out.println("2. Rectangle");
       		System.out.println("3. Parallelogram");
       		System.out.println("4. Trapezium");
       		System.out.println("5.Exit");
       		int ch = sc.nextInt();
	       	switch(ch)
		{
			case 1:
				// Square
				System.out.println("Enter 8 coordinates of square: ");
				int s1 = sc.nextInt();
				int s2 = sc.nextInt();
				int s3 = sc.nextInt();
				int s4 = sc.nextInt();
				int s5 = sc.nextInt();
				int s6 = sc.nextInt();
				int s7 = sc.nextInt();
				int s8 = sc.nextInt();
				Square1 sq = new Square1(s1, s2, s3, s4, s5, s6, s7, s8);
				System.out.println("Area of square is " + sq.area());
				break;
			case 2:
				// Rectangle
				System.out.println("Enter 8 coordinates of rectangle: ");
				int r1 = sc.nextInt();
				int r2 = sc.nextInt();
				int r3 = sc.nextInt();
				int r4 = sc.nextInt();
				int r5 = sc.nextInt();
				int r6 = sc.nextInt();
				int r7 = sc.nextInt();
				int r8 = sc.nextInt();
				Rectangle2 rc = new Rectangle2(r1, r2, r3, r4, r5, r6, r7, r8);
				System.out.println("Area of rectangle is " + rc.area());
				break;
		  	case 3:
			  	// Parallelogram
			  	System.out.println("Enter 8 coordinates of parallelogram: ");
				int p1 = sc.nextInt();
				int p2 = sc.nextInt();
				int p3 = sc.nextInt();
				int p4 = sc.nextInt();
				int p5 = sc.nextInt();
				int p6 = sc.nextInt();
				int p7 = sc.nextInt();
				int p8 = sc.nextInt();
				Parallelogram pr = new Parallelogram(p1, p2, p3, p4, p5, p6, p7, p8);
				System.out.println("Area of Parallelogram: " + pr.area());
				break;
			case 4:				
				// Trapezium
				System.out.println("Enter 8 coordinates of trapezium: ");
				int t1 = sc.nextInt();
				int t2 = sc.nextInt();
				int t3 = sc.nextInt();
				int t4 = sc.nextInt();
				int t5 = sc.nextInt();
				int t6 = sc.nextInt();
				int t7 = sc.nextInt();
				int t8 = sc.nextInt();
				Trapezium tr = new Trapezium(t1, t2, t3, t4, t5, t6, t7, t8);
				System.out.println("Area of Trapezium: " + tr.area());
				break;
			case 5:
				System.out.println("Exiting the program");
				System.exit(0);
				break;
			default: System.out.println("Enter correct choice");
		}
	}
    }
}
