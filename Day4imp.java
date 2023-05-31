/*2. Create a class Stack that declares a stack and the methods to perform push ( ), pop ( )and
checkEmpty ( ) operations on the stack. Create two stacks and write a menu-driven program to perform operations
        on the  two  stacks.  Whenever the number of elements in the two stacks becomes equal,
        a message should automatically be generated displaying the number of elements in each stack.*/
import java.util.*;
public class Day4imp
{
	public void count(Stack st1, Stack st2)
	{
		if (st1.count() == st2.count())
            		System.out.println("Total number of elements in both stack is: " + st2.count());
        }
        public static void main(String[] args)
        {
        	Scanner sc = new Scanner(System.in);
        	Day4 s1 = new Day4(20);
        	Day4 s2 = new Day4(20);
        	Day4imp s3 = new Day4imp();
        	while(true)
        	{
        		System.out.println("Enter your choice");
            		System.out.println("1.Push in Stack1 2.Push in Stack2 3.Pop in Stack1 4.Pop in Stack2 5.Exit");
            		System.out.println("Enter your choice");
            		int ch = sc.nextInt();
            		int ele;
            		switch(ch)
            		{
            			case 1:
            				System.out.println("Enter element to be pushed in stack1");
            				ele = sc.nextInt();
            				s1.push(ele);
            				s3.count(s1, s2);
            				break;
            			case 2:
            				System.out.println("Enter element to be pushed in stack2");
            				ele = sc.nextInt();
            				s2.push(ele);
            				s3.count(s1, s2);
           				break;
           			case 3:
            				System.out.println("Popping element from s1");
					System.out.println(s1.pop());
					s3.count(s1, s2);
					break;
				case 4:
            				System.out.println("Popping element from s2");
					System.out.println(s2.pop());
					s3.count(s1, s2);
					break;
				case 5:
					System.out.println("Exiting the program");
					System.exit(0);
					break;
				default:System.out.println("Enter correct choice");
			}
		}
	}
}
