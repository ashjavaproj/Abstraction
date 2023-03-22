package pdf1.Task5;

public class Details implements PersonDetails, StudentDetails{
	//implement methods here
    public  void rollNo()
    {
    System.out.println("Student Rollno = 11");
    }
    public void name()
    {
    	System.out.println(" Name = MAnasvi D. Bhosale");
    }
    public void stuname()
    {
    	System.out.println("Student Name = Manasvi");
    }
    
        public static void main(String[] args) {
        	System.out.println("*~*~*~calling methods throug PersonDetails reference");
        	PersonDetails p=new Details();
    		//call method here
    		p.rollNo();
    		p.name();
    		//p.stuname();not part of PersonDetails interface
        	
        	System.out.println("*~*~*calling methods throug StudentDetails reference");
        	StudentDetails s=new Details();
    		//call method here
    		s.rollNo();
    		//s.name();//not part of StudentDetails interface
    		s.stuname();
        	
        	System.out.println("*~*~*calling methods throug current class object");
        	Details d = new Details();
        		//call method here
        		d.rollNo();
        		d.name();
        		d.stuname();
   	}
}
