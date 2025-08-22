class friend
{
	String name;
	String add;
	String mon;
	String email;
	
		friend()
		{
			System.out.println("\n Defult constructer called:");
			name="Amani";
			add="Ahmedabad";
			mon="2435679890";
			email="ammu1234@gmail.com";
		}
		friend(String nm)
		{
			System.out.println("\n one Argment:");
			name=nm;
		}
		friend(String add,String mon)
		{
			System.out.println("\n Two argument:");
			add=add;
			mon=mon;
		}
		void display()
		{
				
		System.out.println("\n name is:"+name);
		System.out.println("\n add is:"+add);
		System.out.println("\n mon is:"+mon);
		System.out.println("\n email is:"+email);
		}
	
}
class p8
{
	public static void main(String args[])
	{
		friend f1=new friend();
		f1.display();
		
		friend f2=new friend("xoxo");
		System.out.println("\n name:"+f2.name);
		
			friend f3=new friend("surat","1256932240");
			System.out.println("\n add:"+f3.add);
			System.out.println("\n mon:"+f3.mon);
	}
}
			