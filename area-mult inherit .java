//using multiple inheritence
interface Rect
{
	double rectarea(double p,double q);
}

interface Tri
{
	double trianglearea(double a,double b);
}

class figure implements Rect,Tri
{
	public double rectarea(double p,double q)
	{
		return p*q;
	}
	public double trianglearea(double a,double b)
	{
		return 0.5*a*b;
	}
}

class program10
{
	public static void main(String args[])
	{
		figure f=new figure();
		double r=f.rectarea(8.5,4.0);
		System.out.println("area of rectangle is" + r);
		double s=f.trianglearea(4.0,2.0);
		System.out.println("area of triangle is" + s);
	}
}


