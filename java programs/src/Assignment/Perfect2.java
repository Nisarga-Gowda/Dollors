package Assignment;

import java.util.Scanner;

public class Perfect2 {
	public static void main(String args[])
	{
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		num=sc.nextInt();
		if(num>0)
		{
			for(int i=1;i<=num/2;i++)//1<=3//6%1==0
			{
				if(num%i==0)
				{
					sum=sum+i;
				}
			}
				if(sum==num)
				{
					System.out.println("perfect no");
				}
				else
				{
					System.out.println("not pefect");
				}
			}
		}
	}


