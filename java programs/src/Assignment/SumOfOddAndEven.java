package Assignment;

import java.util.Scanner;

public class SumOfOddAndEven {
	public static void main(String args[])
	{
		int n,count=1;
		int even_sum=0,odd_sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range");
		n=sc.nextInt();
		while(count!=n+1)
		{
			if(count%2==0)
				even_sum=even_sum+count;
			else
				odd_sum=odd_sum+count;
			count++;
			
		}
		System.out.println(count);
		System.out.println("Summation of Odd"+odd_sum);
		System.out.println("summation of Even"+ even_sum);
		sc.close();
	}

}
