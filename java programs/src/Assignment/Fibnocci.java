package Assignment;

import java.util.Scanner;

public class Fibnocci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		//System.out.println(a+" "+b);
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("number");
		int n=sc.nextInt();
		for(int i=0;i<=n-1;i++)
		{
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}
	}

}
