import java.io.*;
import java.util.*;
class program17
{
	public static void main(String args[]) throws IOException
	{
		String data;
		int i,k;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter data");
		data=s.nextLine();
		FileOutputStream fout=null;
		FileInputStream fin=null;
		BufferedReader b=null;
		try
		{
			fout=new FileOutputStream("out.txt");
			for(i=0;i<data.length();i++)
			{
				k=(int)data.charAt(i);
				fout.write(k);
			}
			b=new BufferedReader(new FileReader("out.txt"));
			String s1=b.readLine();
			System.out.println(s1);
			String[] words=s1.split(" ");
			int rno=Integer.parseInt(words[0]);
			String nm=words[1];
			int num1=Integer.parseInt(words[2]);
			int num2=Integer.parseInt(words[3]);
			int num3=Integer.parseInt(words[4]);
			float f=(num1+num2+num3)/3;
			System.out.println("the student name is " + nm + " roll no " + rno + " average is " + f);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	fout.close();
	}
}