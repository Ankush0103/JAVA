import java.util.Scanner;
class Count
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int upper = 0, lower = 0, digit = 0, space = 0;
		for(int i = 0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				upper++;
			if(ch >= 'a' && ch <= 'z')
				lower++;
			if(ch >= '0' && ch <= '9')
				digit++;
			if(ch == ' ')
				space++;
				
		}
		System.out.println("Uppercase letter: " + upper);
		System.out.println("Lowercase letter: " + lower);
		System.out.println("Digits: " + digit);
		System.out.println("Space: " + space);
	}
}
		
