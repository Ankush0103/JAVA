import java.util.Scanner;

public class StackImp {
    public void count(Stack st1, Stack st2) {
        if (st1.count() == st2.count())
            System.out.println("Total number of elements in both stack is: " + st2.count());
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s1 = new Stack(20);
        Stack s2 = new Stack(20);
        int ch, ele;
        ch = 1;
        StackImp si = new StackImp();
        
        while (ch!=0) {
            System.out.println("Enter your choice");
            System.out.println("1.Push in Stack 1: ");
            System.out.println("2.Push in Stack 2: ");
            System.out.println("3.Pop in Stack 1: ");
            System.out.println("4.Pop in Stack 2: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the element: ");
                    ele = sc.nextInt();
                    s1.push(ele);
                    si.count(s1, s2);
                    break;
                case 2:
                    System.out.println("Enter the element: ");
                    ele = sc.nextInt();
                    s2.push(ele);
                    si.count(s1, s2);
                    break;
                case 3:
                    System.out.println("Popping element from s1");
                    System.out.println(s1.pop());
                    si.count(s1, s2);
                    break;

                case 4:
                    System.out.println("Popping element from s2");
                    System.out.println(s2.pop());
                    si.count(s1, s2);
                    break;
                default:
                	
            }
        }
    }
}

