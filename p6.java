 class freind
 {
	String name="xoxo";
	String add="ahmedabad";
	String mon="1253467890";
	String email="xoxo12345@gmail.com"; 	
	int rollno;
	String div;
	freind()
	{
			rollno="1";
			div="sybca-e";
	}
	freind(int r,String d)
	{
		rollno=r;
		div=d;
	}
	void display()
	{
		System.out.println("\n name is:"+name);
		System.out.println("\n add is:"+add);
		System.out.println("\n mon is:"+mon);
		System.out.println("\n email is:"+email);
		System.out.println("\n rollno is:"+rollno);
		System.out.println("\n div is:"+div);
	}
}
class p6
{
	public static void main(String args[])
	{
		freind f1 = new freind();
		f1.display();
	}
}