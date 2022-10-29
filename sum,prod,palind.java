//program prints sum,product and reverse of digits of entered integer
import java.util.*;
class sumpr
{
	public static void main(String args[])
	{
		int n,sum=0,prod=1,rev=0;
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n==0)
		{
			prod=0;
		}
		while(n!=0)
		{
			int x;
			x=n%10;
			sum=sum+x;
			prod=prod*x;
			n=n/10;
			rev=(rev*10)+x;
		}
		
		System.out.println("sum of integers= "+sum);
		System.out.println("product of integers="+prod);
		System.out.println("reverse of integers="+rev);
	}
}
