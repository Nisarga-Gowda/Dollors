package Assignment;

import java.util.Scanner;

public class fibnoci2 {
	public static void main(String args[])
	{
		int n;
		int a=0;
		int b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("nooo");
		n=sc.nextInt();
		int fact;
		for(int i=0;i<n;i++)
		{
		int c=a+b;
			System.out.println(("fibnocci  series"+c));
			a=b;
			b=c;
		}
			fact=1;
			for(int j=n;j>0;j--)
		{
				
				fact=fact*j;
		}
		System.out.println("factorial   "+fact);
}}
