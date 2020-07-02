package Assignment;

import java.util.Scanner;

public class Factorial {
public static void main(String args[])
{
	int num,fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("number?");
	num=sc.nextInt();
	for(int i=num;i>0;i--)
	{
		fact=fact*i;
	}
	System.out.println(fact);
	}
}

