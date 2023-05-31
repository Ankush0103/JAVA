package inout;
import java.util.*;
public class Input{
  static Scanner sc = new Scanner(System.in);
  public static int getInt(){
    int n = sc.nextInt();
    return n;
  }
  public static double getDouble(){
    double d = sc.nextDouble();
    return d;
  }
  public static String getStr(){
    String s = sc.nextLine();
    return s;
  }
  public static char getChar(){
    char ch = sc.next().charAt(0);
    return ch;
  }
  public static void main(String args[]){}
}

