//matrix sum,add,transpose,multiplication
import java.util.Scanner;
class program8
{
	public static void main(String arg[])
	{
		System.out.println("Enter your choice");
		System.out.println("Enter 1 for sum");
		System.out.println("Enter 2 for difference");
		System.out.println("Enter 3 for transpose");
		System.out.println("Enter 4 for multiplication");
		System.out.println("Invalid input");
		int i,j;
		int choice;
		Scanner s=new Scanner(System.in);
		choice=s.nextInt();
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int sum[][]=new int[2][2];
		int diff[][]=new int[2][2];
		int trans[][]=new int[2][2];
		System.out.println("enter values for matrix A");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				int x=s.nextInt();
				a[i][j]=x;
			}
		}
		System.out.println("enter values for matrix B");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				int x=s.nextInt();
				b[i][j]=x;
			}
		}
		System.out.println("matrix A is");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("matrix B is");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
		
		switch(choice)
		{
			case 1:for (i=0;i<2;i++)
					{
						for(j=0;j<2;j++)
						{
							sum[i][j]=a[i][j]+b[i][j];
						}
					}
					System.out.println("sum of matrices is");
					for(i=0;i<2;i++)
					{
						for(j=0;j<2;j++)
						{
							System.out.print(sum[i][j] + "\t");
						}
						System.out.println();
					}
					break;
			case 2:for (i=0;i<2;i++)
					{
						for(j=0;j<2;j++)
						{
							diff[i][j]=a[i][j]-b[i][j];
						}
					}
					System.out.println("difference of matrices is");
					for(i=0;i<2;i++)
					{
						for(j=0;j<2;j++)
						{
							System.out.print(diff[i][j] + "\t");
						}
						System.out.println();
					}
					break;
			case 3:for (i=0;i<2;i++)
					{
						for(j=0;j<2;j++)
						{
							trans[j][i]=a[i][j];
						}
					}
					System.out.println("transpose of matrix A is");
					for(i=0;i<2;i++)
					{
						for(j=0;j<2;j++)
						{
							System.out.print(trans[i][j] + "\t");
						}
						System.out.println();
					}
					break;
			case 4:System.out.println("enter size of first matrix");
				   int r1=s.nextInt();
				   int c1=s.nextInt();
				   System.out.println("enter size of second matrix");
				   int r2=s.nextInt();
				   int c2=s.nextInt();
				   if(c1!=r2)
				   {
					   System.out.println("Incompatible operation");
				   }
				   else
				   {
					   int m[][]=new int[r1][c1];
					   int n[][]=new int[r2][c2];
					   int c[][]=new int[r1][c2];
					   System.out.println("enter value of matrix A");
					   for(i=0;i<r1;i++)
					   {
						   for(j=0;j<c1;j++)
						   {
							   m[i][j]=s.nextInt();
						   }
					   }
					   System.out.println("enter value of matrix B");
					   for(i=0;i<r2;i++)
					   {
						   for(j=0;j<c2;j++)
						   {
							   n[i][j]=s.nextInt();
						   }
						   
					   }
					   for(i=0;i<r1;i++)
					   {
						   for(j=0;j<c2;j++)
						   {
							   c[i][j]=0;
							   for(int k=0;k<c1;k++)
							   {
								   c[i][j]=c[i][j]+m[i][k]*n[k][j];
							   }
						   }
					   }
					   System.out.println("multiplication is:");
					   for(i=0;i<r1;i++)
					   {
						   for(j=0;j<c2;j++)
						   {
							   System.out.print(c[i][j]+"\t");
						   }
						   System.out.println();
					   }
					   break;
				   }
			default:
					System.out.println("invalid input");
		}
	}
}
				   
					  
										   
							 
						   
					   
					
				
					
			 
			
			
		    
			
		
		
		
			