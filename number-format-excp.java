//exceptional handling using throw keyword
import java.util.Scanner;
class program14
{
	public static void main(String args[])
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a");
		a=s.nextInt();
		System.out.println("Enter value of b");
		b=s.nextInt();
		try
		{
			if(a>=0 && a<=9)
			{
				if(b>=0 && b<=9)
				{
					System.out.println("correct values");
					System.out.println("you entered" + a + "and" + b); 
				}
				else
				{
					throw new NumberFormatException();
				}
			}
			else
			{
				throw new NumberFormatException();
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			getmessage();
			
		}
	}
	static void getmessage()
			{
				System.out.println("you entered incorrect values");
			}
}
		