package Assignment;

import java.util.Scanner;

public class PerfectNo {
public static void main(String args[])
{
	int num,sum=0;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter number");
	num=in.nextInt();
	if(num>0)
	{
	for(int i=1;i<=num/2;i++)
	{
		if(num%i==0)
		{
			sum=sum+i;
		}
		
	}
	if(sum==num)
	{
		System.out.println(num+"  is perfect Number");
	}
	else
	{
		System.out.println("not perfect");
	}
	}
	else {
		System.out.println("Enter positive no");
	}
}
}
