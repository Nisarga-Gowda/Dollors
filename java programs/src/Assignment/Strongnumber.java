package Assignment;

import java.util.Scanner;

public class Strongnumber {
	public static void main(String args[])
	{
		
		System.out.println("enter no");
		int num,rem;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int temp=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+fact(rem);
					num=num/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+"is strong no");
		}
		else
		{
			System.out.println(temp+"is not strong enough");
		}
		
		
	}

	public static int fact(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
}