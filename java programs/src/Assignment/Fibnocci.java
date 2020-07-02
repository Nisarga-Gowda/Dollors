package Assignment;

public class Fibnocci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		//System.out.println(a+" "+b);
		int c;
		for(int i=0;i<=15;i++)
		{
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}
	}

}
