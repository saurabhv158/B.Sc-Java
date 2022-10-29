import java.util.Scanner;
class program15
{
	public static void main(String args[])
	{
		String s1=new String("welcome to");
		String s2=new String("java");
		Scanner s=new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("enter 1 for compare");
		System.out.println("enter 2 for concat");
		System.out.println("enter 3 for compute length");
		int ch;
		ch=s.nextInt();
		switch(ch)
		{
			case 1 :System.out.println("after compare result is"+  s2.compareTo(s1));
					break;
			case 2 :s2=s2.concat(s1);
					System.out.println("after concat result is"+  s2);
					break;
			case 3 :System.out.println("length of s1 string is"+  s1.length());
					System.out.println("length of s2 string is"+  s2.length());
					break;
			default :System.out.println("invalid input");
					break;
					
		}
	}
}