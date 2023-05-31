import java.util.Scanner;
class Arraymerge
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array1: ");
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		System.out.println("Enter elements in array1 in sorted way: ");
		for(int i = 0; i<n1; i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter number of elements in array2: ");
		int n2 = sc.nextInt();
		int arr2[] = new int[n2];
		System.out.println("Enter elements in array2 in sorted way: ");
		for(int j = 0; j<n2; j++)
		{
			arr2[j] = sc.nextInt();
		}
		System.out.println("Array1: ");
		for(int i = 0; i<n1; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		System.out.println("\nArray2: ");
		for(int j = 0; j<n2; j++)
		{
			System.out.print(arr2[j] + " ");
		}
		int arr3[] = new int[n1 + n2];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<n1 && j<n2)
		{
			if(arr1[i]<=arr2[j])
			{
				arr3[k++] = arr1[i];
				i++;
			}
			else
			{
				arr3[k++] = arr2[j];
				j++;
			}
		}
		if(i == n1)
		{
			while(j<n2)
			{
				arr3[k++] = arr2[j++];
			}
		}
		if(j==n2)
		{
			while(i<n1)
			{
				arr3[k++] = arr1[i++];
			}
		}
		System.out.println("\nMerged Array: ");
		for(k = 0; k<n1+n2; k++)
		{
			System.out.print(arr3[k] + " ");
		}
	}
}
	
	
