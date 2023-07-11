
package kodnest;
import java.util.Scanner;
class FindSmall
{
	int Small(int[] arr)
	{
	
	int min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
	if(arr[0]>arr[i])
	{
	min=arr[i];
	
	
	}
	
	}
	return min;
}
}
public class Array {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		FindSmall s=new FindSmall();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		int res=s.Small(arr);
		System.out.println(res);
	}
}

		
