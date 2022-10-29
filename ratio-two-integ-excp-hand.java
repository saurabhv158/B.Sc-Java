import java.util.*;
class prog16
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		int choice=1;
		while(choice!=0)
		{
			System.out.println("enter the value of divisor and dividend");
		int d1,d2,rem,q;
		d1=s.nextInt();
		d2=s.nextInt();
		
			
		System.out.println("do you want to continue 1/0");
		choice=s.nextInt();
		try
		{
			q=d1/d2;
		rem=d1%d2;
		System.out.println("rem is"+rem);
		System.out.println("quiotent is"+q);
			//Exception in thread "main" java.lang.ArithmeticException: / by zero at rem.main(rem.java:15)
		}
		catch(Exception e)
		{
		System.out.println(e);
			
		}
	}
}
}		