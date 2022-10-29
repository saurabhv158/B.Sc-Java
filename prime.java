import java.util.Scanner;
class prime
{
	public static void main (String args[])
		{
			int i,n,m=0;
			System.out.println("enter a number");
			Scanner s= new Scanner(System.in);
			n=s.nextInt();
			//n=Integer.parseInt(args[0]);
			
			for(i=2;i<=n-1;i++)
				if(n%i==0)
					m=1;
			if(m==1)
				{
					System.out.println("number is not prime");
				}
			else
				{
					System.out.println("number is prime");
				}
		}
}
			
			