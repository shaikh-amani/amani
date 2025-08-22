public class p3
{
	public static void main(String args[])
	{
		System.out.println("enter number :"+args[0]);
		int N=Integer.parseInt(args[0]);
		//int fact=1;
		int sum=1;
		for(int i=1;i<=N;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+ "They are even number");
				sum+=i;
			}
		}
			System.out.println("sum is:"+sum);
	}
}
	
	
	
	