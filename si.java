public class si
{
	public static void main(String args[])
	{
		System.out.println("First argment"+args[0]);
		int pi=Integer.parseInt(args[0]);
		System.out.println("Second argment"+args[1]);
		int r=Integer.parseInt(args[1]);
		System.out.println("Third argment"+args[2]);
		int t=Integer.parseInt(args[2]);
		int si=(pi*r*t)/100;
		System.out.println("Result of si:"+si);
	}
}
		