package kodnest;
import java.util.*;
class Rev
{
	int[] Find(int arr[],int start,int end)
	{
		while(start<end)
		{
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
		}
		return arr;
	}
}
public class ReverseArray {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		Rev r=new Rev();
		int arr1[]=r.Find(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
		
		 System.out.println(arr1[i]);
		}
	}

}
