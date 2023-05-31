/*2.	The annual examination results of 6 students are tabulated as follows:
          Roll No.                        Subject 1                                Subject 2                                Subject 3
     
            …..
	…..
	    
            Write a program to read the data and determine the following:
(a)	Total marks obtain by each student
(b)	The highest marks in each subject and the roll no of the student who secured it 
(c)	The student who obtained the highest total marks.*/

import java.util.Scanner;
class Student
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int n = sc.nextInt();
		int arr[][] = new int[n][4];
		for(int i = 0; i<n; i++)
		{
			System.out.println("Enter Roll number of student " + (i+1));
			arr[i][0] = sc.nextInt();
			System.out.println("Enter Physics marks of student " + (i+1));
			arr[i][1] = sc.nextInt();
			System.out.println("Enter Chemistry marks of student " + (i+1));
			arr[i][2] = sc.nextInt();
			System.out.println("Enter Maths marks of student " + (i+1));
			arr[i][3] = sc.nextInt();
		}
		System.out.println("Roll No.\t Physics\t Chemistry\t Maths\t");
		for(int i = 0; i<n; i++)
		{
			
			System.out.println(arr[i][0] + "\t\t" + arr[i][1] + "\t\t" + arr[i][2] + "\t\t" + arr[i][3]);
			
		}
		int[] total = new int[n];
		for(int i = 0; i<n; i++)
		{
			total[i] = arr[i][1] + arr[i][2] + arr[i][3];
		}
		for(int i = 0; i<n; i++)
		{
			System.out.println("Total marks of Student " + (i+1) + ": " + total[i]);
		}
		int p_max = arr[0][1];
		for(int i = 1; i<n; i++)
		{
			if(arr[i][1]>p_max)
				p_max = arr[i][1];
		}
		int c_max = arr[0][2];
		for(int i = 1; i<n; i++)
		{
			if(arr[i][2]>c_max)
				c_max = arr[i][2];
		}
		int m_max = arr[0][3];
		for(int i = 1; i<n; i++)
		{
			if(arr[i][3]>m_max)
				m_max = arr[i][3];
		}
		int t_max = total[0];
		for(int i = 1; i<n; i++)
		{
			if(total[i]>t_max)
				t_max = total[i];
		}
		System.out.println("Highest marks in physics is " + p_max + " and is obtained by ");
		for(int i = 0; i<n; i++)
		{
			if(arr[i][1] == p_max)
				System.out.println(arr[i][0]);
		}
		System.out.print("\nHighest marks in chemistry is " + c_max + " and is obtained by ");
		for(int i = 0; i<n; i++)
		{
			if(arr[i][2] == c_max)
				System.out.println(arr[i][0]);
		}
		System.out.print("\nHighest marks in maths is " + m_max + " and is obtained by ");
		for(int i = 0; i<n; i++)
		{
			if(arr[i][3] == m_max)
				System.out.println(arr[i][0]);
		}
		System.out.print("\nHighest total marks is " + t_max + " and is obtained by ");
		for(int i = 0; i<n; i++)
		{
			if(total[i] == t_max)
				System.out.println(arr[i][0]);
		}
	}
}
