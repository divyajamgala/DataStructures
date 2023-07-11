package kodnest;
import java.util.*;
class Mini{
	int Find(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		
		if(arr[i]<min)
		{
			min=arr[i];
		}
		}
		return min;
	}
}
public class MinimumValue {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int[]arr=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		Mini m=new Mini();
		int d=m.Find(arr);
		System.out.println(d);
		
	}

}
