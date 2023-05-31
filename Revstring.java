class Revstring
{
	public static void main(String[] args)
	{
		String s = "";
		System.out.println("Reversed Word");
		for(int i = args.length-1; i>=0; i--)
		{
			System.out.print(args[i]);
			System.out.print(" ");
		}
		System.out.println("\nReversed String");
		for(int i = args.length-1; i>=0; i--)
		{
			for(int j = args[i].length() - 1; j>=0; j--)
			{
				s = s + args[i].charAt(j);
			}
			s = s + " ";
		}
		System.out.println(s);
	}
}

