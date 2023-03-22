package pdf1.Task4;

public class Test implements A,B{
	public void m1(){
		System.out.println("M1___A");
		
	}
	
	public int m2(){
		System.out.println("M2___B");
		return 10;
	}
     	public static void main(String args[]){	
     		
     	A a=new Test();
     	a.m1();
     	B b=new Test();
     	b.m2();
     	
	
   	}
}
