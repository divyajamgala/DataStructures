package kodnest;

import java.util.Scanner;
class Divya
{
	static int[] Hasya(int arr[])
	{
		return arr;
	}
}
public class Demo {
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.println("enter");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
	}
	
	int arr1[]=Divya.Hasya(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr1[i]);
	}
System.out.println();
	}
}
