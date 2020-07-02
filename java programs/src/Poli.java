
public class Poli {
	
		public static void main(String args[])
		{
			int r,sum=0,n=10,temp=n;
			//System.out.println("enter the number"+n);
			while(n!=0)
			{
				r=n%10;
				sum=(sum*10)+r;
				n=n/10;
			}
			if(temp==sum) {
				System.out.println("polidrome");
			}
			else
			{
				System.out.println("not polidromr");
			}
		}

	}



