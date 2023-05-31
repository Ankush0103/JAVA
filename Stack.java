/*2. Create a class Stack that declares a stack and the methods to perform push ( ), pop ( )and
checkEmpty ( ) operations on the stack. Create two stacks and write a menu-driven program to perform operations
        on the  two  stacks.  Whenever the number of elements in the two stacks becomes equal,
        a message should automatically be generated displaying the number of elements in each stack.*/
import java.util.Scanner;
public class Stack {
    int top, max, len;
    int[] s;

    Stack(int i) {
        max = i;
        s = new int[max];
        len = 0;
        top -= 1;
    }


    void push(int data) {
        if (top == max)
            System.out.println("Stack Overflow");
        else
            s[++top] = data;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return s[top--];

    }

    boolean checkEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public int count() {
        if (top > -1)
            return top + 1;
        else
            return 0;
    }
}
