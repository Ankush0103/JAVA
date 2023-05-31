import org.shapes.*;
import static inout.Input.*;
import static inout.Output.*;
import java.util.*;

class Ts{
  public static void main(String args[]){
    double s, r, s1, s2, s3;
    showStr("Enter the side of the square: ");
    s = getDouble();
    Sr1 obj1 = new Sr1(s);
    showStr("Perimeter of the Square: ");
    showStr(obj1.perimeter());
    showStr("Area of the Square: ");
    showStr(obj1.area());
    
    System.out.println("Enter the radius of the circle: ");
    r = getDouble();
    Cl1 obj2 = new Cl1(r);
    showStr("Circumference of the Circle: ");
    showStr(obj2.circumference());
    showStr("Area of the Circle: ");
    showStr(obj2.area());
  
    showStr("Enter the three sides of the triangle: ");
    s1 = getDouble();
    s2 = getDouble();
    s3 = getDouble();
    Tr1 obj3 = new Tr1(s1, s2, s3);
    showStr("Perimeter of the Triangle: ");
    showStr(obj3.perimeter());
    showStr("Area of the Triangle: ");
    showStr(obj3.area());
  }
}

