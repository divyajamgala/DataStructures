package kodnest;
import java.util.*;
class Friend
{
	int[] Finding(int arr[])
	{
		int count=0;
		int n=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
				
			}
		}
		while(count<n)
		{
		arr[count++]=0;	
		}
		return arr;
	}
}
public class MovingZerosToEnd {
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
	}
	Friend f=new Friend();
	int arr1[]=f.Finding(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr1[i]);
	}
	
}
}
