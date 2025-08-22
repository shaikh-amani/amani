class shape1
{
	int rect(int a, int b)
	{
			return a*b;
	}
	double circal(double r)
	{
		return 3.14*r*r;
	}
}
class shape
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		double c=Double.parseDouble(args[2]);
		shape r1=new shape();
		System.out.println("area of rectangle"+r1.rect(a,b));
		System.out.println("area of circal"+r1.circal(c));
	}
}

		