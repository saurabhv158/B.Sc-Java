//program to print for avg of prices and compare them
import java.util.*;
class pavg
{
	public static void main(String args[])
	{
		int size,a=0,j=0,k=0,sum=0;
		double avg;
		System.out.println("enter price list`s size");
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		int num[]=new int [size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter new price");
			num[i]=s.nextInt();
		}
		System.out.println("you entered: "); //time to print the entered values
		for(int i=0;i<size;i++)
		{
			System.out.println(num[i]);
		}
		for(int i=0;i<size;i++)
		{
			sum=sum+num[i];
		}
		avg=(double)sum/size;
		for(int i=0;i<size;i++)
		{
			if(avg<num[i])
			{
				a=a+1;
			}
			else if(avg==num[i])
			{
				j=j+1;
			}
			else
			{
				k=k+1;
			}
		}
		System.out.println("avg of entered prices is "+avg);
		System.out.println("now among the entered prices there are ");
		System.out.println(a+" price(s) > "+avg);
		System.out.println(j+" price(s) = "+avg);
		System.out.println(k+" price(s) "+avg);
	}
}