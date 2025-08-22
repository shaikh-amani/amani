public class p2
{
	public static void main(String args[])
	{
			int limit=100;
			for(int i=1;i<=limit;i++)
			{
				if(i%5==0 && i%10!=0)
				{
					System.out.println(i+" It is divisible by 5,");
				}
			}
	}
}
