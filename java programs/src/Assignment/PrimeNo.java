package Assignment;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		no=sc.nextInt();
		int temp=0;
		for(int i=2;i<no-1;i++)
		{
			if(no%i==0)
			{
			temp=temp+i;
		}

	}
	if(temp>0)
	{
		System.out.println("not prime ");
	}
	else
	{
		System.out.println(" prime");
	}

}
}
