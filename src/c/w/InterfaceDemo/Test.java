package c.w.InterfaceDemo;

public class Test 
{
	public static void main(String args[])
	{
		connection c1=new oracle();
		connection c2=new mysql();
		c1.m1();
		c1.m2();
		c2.m1();
		c2.m2();
	}

}
