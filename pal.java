import java.util.*;
class Frp
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Number 2. Palindrome 3. Type 0 to exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter number to be checked");
					int num = sc.nextInt();
					int temp = num;
					int rem,sum = 0;
					while(num>0)
					{
						rem = num%10;
						sum = sum*10 + rem;
						num = num/10;
					}
					if(temp == sum)
					{
						System.out.println(temp + " is palindrome number");
					}
					if(temp != sum)
					{
						System.out.println(temp + " is not palindrome number");
					}
					break;
				case 2:
					System.out.println("Enter string to be checked");
					String s = sc.next();
					int l = s.length();
					String s1 = "";
					char c;
					for(int j = l-1; j>=0; j--)
					{
						c = s.charAt(j);
						s1 = s1 + c;
					}
					if(s1.equals(s))
						System.out.println(s+ " Palindrome String");
					else
						System.out.println(s + " Not Palindrome");
					break;
				case 3:
					System.out.println("Exiting the progrsm");
					System.exit(0);
					break;
				default: System.out.println("Give Correct Input");
			}
		}
	}
}
		
