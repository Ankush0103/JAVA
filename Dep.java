/**1.	Create an interface Department containing attributes deptName and deptHead. It also has abstract methods for printing
        the attributes. Create a class hostel containing hostelName, hostelLocation and numberOfRooms. The class contains method
        printing the attributes.  Then write Student class extending the Hostel class and implementing the Department interface.
        This class contains attributes studentName, regdNo, electiveSubject and avgMarks. Write suitable printData method for this class.
        Also implement the abstract methods of the Department interface. Write a driver class to test the Student class.
        The program should be menu driven containing the options: i)	Admit new student		ii) Migrate a student
        iii) Display details of a student For the third option a search is to be made on the basis of the entered registration number.*/
import java.util.*;
interface Department
{
	public void getdeptName();
	public void getdeptHead();
}

class Hostel
{
	String hostelName, hostelLocation;
	int numberOfRooms;
	public void gethostelName()
	{
		System.out.println("Hostel name is " + hostelName);
	}
	public void gethostelLocation()
	{
		System.out.println("Hostel location is " + hostelLocation);
	}
	public void getnumberOfRooms()
	{
		System.out.println("Number of rooms is " + numberOfRooms);
	}
}

class Student extends Hostel implements Department
{
	String  studentName, electiveSubject, deptName, deptHead;
	int regdNo, avgMarks, nnumberOfRooms;
	Scanner sc = new Scanner(System.in);
	int getregdNo()
	{
		return regdNo;
	}
	public void printData()
	{
		System.out.println("Student name: " + studentName);
        	System.out.println("Student registration no.: " + regdNo);
        	System.out.println("Student hostel name: " + hostelName);
        	System.out.println("Student hostel location: " + hostelLocation);
        	System.out.println("Student hostel rooms: " + numberOfRooms);
        	System.out.println("Student electiveSubject: " + electiveSubject);
        	System.out.println("Student's average marks: " + avgMarks);
        	
        }	
        public void getdeptName()
	{
		System.out.println("Department Name is " + deptName);
	}
	public void getdeptHead()
	{
		System.out.println("Department Head is " + deptHead);
	}
	
	void admit()
	{
		System.out.println("Enter student name: ");
		studentName = sc.nextLine();
		System.out.println("Enter Registration Number: ");
		regdNo = sc.nextInt();
		System.out.println("Enter elective subject: ");
		electiveSubject = sc.next();
		System.out.println("Enter hostel name: ");
		hostelName = sc.next();
		System.out.println("Enter hostel Location: ");
		hostelLocation = sc.next();
		System.out.println("Enter department name: ");
		deptName = sc.next();
		System.out.println("Enter department head: ");
		deptHead = sc.next();
		System.out.println("Enter number of room: ");
		numberOfRooms = sc.nextInt();
		System.out.println("Enter avg marks: ");
		avgMarks = sc.nextInt();
	}
	void migrate()
	{
		System.out.println("Enter new department name: ");
		deptName = sc.next();
		System.out.println("Enter new department head: ");
		deptHead = sc.next();
	}
	void display()
	{
		printData();
		getdeptName();
		getdeptHead();
	}
}

class Dep
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Student st[] = new Student[100];
		int sno = 0;
		int regdNo, ch;
		boolean b;
		while (true)
		{
		    	System.out.println("1.Admit Student 2.Migrate Student 3.Display Student 4.Exit");
		    	System.out.println("Enter your choice");
		    	ch = sc.nextInt();
		    	switch(ch)
		    	{
		    		case 1:
		    			st[sno] = new Student();
		    			st[sno++].admit();
		    			break;
		    		case 2:
		    			System.out.println("Enter regno.");
		    			regdNo = sc.nextInt();
		    			b = false;
		    			for(int i = 0; i<sno; i++)
		    			{
		    				if(st[i].getregdNo()==regdNo)
		    				{
		    					b = true;
		    					st[i].migrate();
		    					break;
		    				}
		    			}
		    			if(b==false)
		    				System.out.println("Student not found");
		    			break;
		    		case 3:
		    			System.out.println("Enter regno.");
		    			regdNo = sc.nextInt();
		    			b = false;
		    			for(int i = 0; i<sno; i++)
		    			{
		    				if(st[i].getregdNo()==regdNo)
		    				{
		    					b = true;
		    					st[i].display();
		    					break;
		    				}
		    			}
		    			if(b==false)
		    				System.out.println("Student not found");
		    			break;
		    		case 4:
				    	System.out.println("Exiting the program");
				    	System.exit(0);
				default:
				    	System.out.println("Enter correct choice");
			}
		}
	}
}
















