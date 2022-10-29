//print armstrong nos from the set
import java.util.Scanner;
class program7
{
	public static void main(String args[])
	{
		int l=0,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter how many number you want to check");
		int n=s.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter new no.");
			num[i]=s.nextInt();
			int a=num[i],b=0,c;
			while(a!=0)
			{
				c=a%10;
				b=b+(c*c*c);
				a=a/10;
			}
				if(num[i]==b)
				{
					count=count+1;
				}
		}
		System.out.println("armstrongs no in array are " + count);
	}
}