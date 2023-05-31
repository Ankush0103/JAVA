import java.util.Scanner;
class Area{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		int radius = sc.nextInt();
		double circumference = 2*3.14*radius;
		double area = 3.14*radius*radius;
		System.out.println("Circumference " + circumference);
		System.out.println("Area " + area);
	}
}
