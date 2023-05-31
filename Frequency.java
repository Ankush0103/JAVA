import java.util.Scanner;
class Frequency
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of inductance");
		double L = sc.nextDouble();
		System.out.println("Enter value of resistance");
		double R = sc.nextDouble();
		double C = 0.01;
		for(C=0.01; C<=0.1; C+=0.01)
		{
			System.out.println("Capacitance: " + C);
			double DF = Math.sqrt(1/L*C - R*R/4*C*C);
			System.out.println("Damped Frequency: " + DF);
		}
	}
}
