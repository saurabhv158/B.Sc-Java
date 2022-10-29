import java.util.Scanner;
class lar
{
	public static void main(String args[])
	{
		int size,l=0;
		System.out.println("enter size");
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		int num[]=new int[size];
		System.out.println("now enter "+size+" numbers");		for(int i=0;i<size;i++)
		{
			num[i]=s.nextInt();
		}
		for(int i=0; i<size;i++)
		{
			if(l<num[i])
				{
					l=num[i];
				}
					
			else
			{
				l=l;
			}
			
		}
		System.out.println("largest number: " +l);
	}
	
}