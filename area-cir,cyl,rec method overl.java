//area of figures by function or method overloading
class figure
{
	double area(double x)
	{
		return 3.14*x*x;
	}
	int area(int x,int y)
	{
		return x*y;
	}
	double area(double r,double h)
	{
		return 3.14*r*r*h;
	}
}
 
class program9
{
	public static void main(String args[])
	{
		figure f=new figure();
		double p=f.area(6);
		System.out.println("area of circle is" + p);
		int q=f.area(4,5);
		System.out.println("area of rectangle is" + q);
		double r=f.area(8.0,12.0);
		System.out.println("area of cylinder is" + r);
	}
}

		