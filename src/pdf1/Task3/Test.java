package pdf1.Task3;

public class Test implements I2{
	//implement methods here
	public void m1()
	{
		System.out.println("M1____I1 interface");
		
	}
	public void m2()
	{
		System.out.println("M2____I2 interface");
		
	}
    	public static void main(String args[]){
		//call methods for object here
		I2 i = new Test();
		i.m2();
		I1 i1=new Test();
		i1.m1();
		Test t=new Test();	
		t.m1();
		t.m2();
		
    	}
}
