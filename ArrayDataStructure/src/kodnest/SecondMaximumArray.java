package kodnest;
import java.util.Scanner;
class Find
{
	int FindMax(int[] arr)
	{
	int secondmax=0;
	int max=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			secondmax=max;
			max=arr[i];
		}
		else if(arr[i]>secondmax && arr[i]!=max)
		{
		secondmax=arr[i];
		}
		
	}
	return secondmax;
	}
}

public class SecondMaximumArray {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		Find f=new Find();
		int res=f.FindMax(arr);
		System.out.println(res);
		
	}

}
