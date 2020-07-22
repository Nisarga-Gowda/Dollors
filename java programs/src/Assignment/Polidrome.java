package Assignment;

import java.util.Scanner;

public class Polidrome {
	public static void main(String args[]) {
		
	
	int no,rem;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no");
	no=sc.nextInt();
	int sum=0;
	int temp=no;
	while(no!=0)
	{
		 rem=no%10;
		sum=(sum*10)+rem;
		no=no/10;
		
	}
	if(temp==sum)
	{
		System.out.println(temp+" is polidrome");
	}
	else
	{
		System.out.println("not polidrome");
	}
}
}