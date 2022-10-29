import java.util.*;
class array
{
	public static void main(String args[])
	{
		int i=0,count=0,m=0,num[]=new int[10],n,l=0;
		System.out.println("enter the number to compare");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for( i=0;i<10;i++)
		{
			System.out.println("enter elements of array");
			num[i]=s.nextInt();
			if(num[i]>n)
			{
				count=count+1;
			}
			else if(n>num[i])
			{
				l=l+1;
			}
			else
			{
				m=m+1;
			}
		}
		System.out.println("you have entered these values");
		for( i=0;i<10;i++) //loop to print the entered values
		{
			System.out.println(num[i]);
		}
		System.out.println("total no. of values larger from "+n+" = "+count);
		System.out.println("total no. values of smaller from "+n+" = "+l);
		System.out.println("total no. of values equal to "+n+" = "+m);
	}
}