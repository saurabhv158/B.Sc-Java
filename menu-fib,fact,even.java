import java.util.*;
class menu
{
	public static void main(String args[])
	{
		int x=1;
		while(x!=0)
		{
			
			System.out.println("\nMENU:");
			System.out.println("Press 1 for Fibonacci Series");
			System.out.println("Press 2 for factorial");
			System.out.println("Press 3 for even or odd");
			System.out.println("Press 4 for number palindrome");
			System.out.println("Press 5 to exit");
			int choice;
			Scanner s=new Scanner(System.in);
			choice=s.nextInt();
			if(choice==5)
			{
				System.out.println("ok.BYE!");
				System.exit(5);
			}
			else
			{
				switch(choice)
				{
				
					case 1:
						int a=0,b=1,c=0,size,j;
					
						size=s.nextInt();
						System.out.println(a);
						System.out.println(b);
						for(j=2;j<size;j++)
							c=a+b;
							a=b;
							b=c;
							System.out.println(c);
						break;
					case 2:
						System.out.println("enter a number");
						int i,n,f=1;
						n=s.nextInt();
						for(i=n;i>=1;i--)
						{
							f=f*i;
						}
						System.out.println("factorial is "+f);
						break;
					case 3:
						int q;
						q=s.nextInt();
						if(q%2==0)
							System.out.println("number is even");
						else
							System.out.println("number is odd");
						break;
					case 4:
						int z,temp,sum=0,rev;
						z=s.nextInt();
						temp=z;
						while(z>0)
						{
							rev=z%10;
							sum=(sum*10)+rev;
							z=z/10;
						}
						if(temp==sum)
						{
							System.out.println("it is palindrome");
						}
						else
						{
							System.out.println("not a palindrome");
						}
						break;
					default:
					
						{
							System.out.println("invalid entry");
						}
				}
			}
		}
	}
}

				