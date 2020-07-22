package Assignment;

import java.util.Scanner;

public class RemoveDuplicate {
	
	public static int duplicate(int arr[],int n)
	{
		
		if(n==0 || n==1) {
		
		return n;
		
		
	}
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
			if(arr[i]!=arr[i+1])
			
				temp[j++]=arr[i];
			
	
	temp[j++]=arr[n-1];
	
	for(int i=0;i<j;i++)
	{
		arr[i]=temp[i];
	}
	System.out.println(j);
	return j;
	
}
	
public static void main(String args[])
{
	int arr[]= {10,20,10};
	int length=arr.length;
	length=duplicate(arr,length);
	for(int i=0;i<length;i++)
		System.out.print(arr[i]+" ");
	
	
		
	}
		
	}

