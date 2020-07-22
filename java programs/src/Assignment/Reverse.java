package Assignment;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=6789;
int rev=0;
while(num!=0)//678.9 is =0
{
	int rem=num%10;//6789%10=9//678.9%10=8
	rev=(rev*10)+rem;//rev=9//8
	num=num/10;//678.9//97.89
	//
}
System.out.println("Reverse no is ------>>>   "+rev);
	}
}
