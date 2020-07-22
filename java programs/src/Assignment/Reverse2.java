package Assignment;

import java.util.Scanner;

public class Reverse2 {
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("nooo");
		num=sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			 rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println("reverse ni is" +rev);
	}

}
