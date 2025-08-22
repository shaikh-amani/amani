public class p5
{
	public static void main(String args[0])
	{
		int no=Integer.parseInt(args[0]);
		int no1=Integer.parseInt(args[1]);
		int no2=Integer.parseInt(args[2]);
		
		if(no>n1 &&no>n2)
		
		{
			System.out.println("no is maximum:"+ no);
		}
		else if(no1>no && no1>no2)
		{
			System.out.println("no1.is maximum:"+no1);
		}
		else if(no2>no1 &&no2>no)
		{
				System.out.println("no2 is maximum:"+no2);
		}
		if(no<no1 && no<no2)
		{
			System.out.println("no is min:"+ no);
		}
		else if(no1<no && no1<no2)
		{
			System.out.println("no1.is min:"+no1);
		}
		else if(no2<no1 &&no2<no)
		{
				System.out.println("no2 is min:"+no2);
		}
	}
}	