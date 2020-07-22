package Assignment;

import java.util.Scanner;

public class Fact2 {
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("nooo");
		num=sc.nextInt();
		int fact=1;
		for(int i=num;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
}
