import java.util.Scanner;
import java.lang.Exception;

class myexception extends Exception{

	public myexception(String s)
		{
			super(s);
		}
} 



class Exception2{



	public static String name;
	public static int age;
	 public int Deptno;
	 public String gmail;

	Scanner sc = new Scanner(System.in);
	
	public Exception2(String name,int age,int deptno,String gmail)
	{	
		
		this.name=name;
		this.age=age;
		this.Deptno=deptno;
		this.gmail=gmail;

		
	}
}

class DataValidation extends Exception2{
	
	public static void Checkvalidation()    //String name,int age,int deptno,String gmail
	{
		try     {
		if(name.charAt(0)<65 || name.charAt(0)>90)
		{
			throw new myexception("First letter should be capital");	
		}
		if(name.length()>12)
			throw new myexception("Name length Should not Greter than 12");
		
		if(age>60 || age <20)
			{
				if(age<20)
				throw new myexception("go school kidoo");
				else
				throw new myexception("Uncle go to home and take rest");
			}
		
		
			
			}catch(myexception e)
			{
				System.out.println(e.toString());
			}			

	}	
	

	
	
    
}

class ExceptionTester{
			public static void main(String []args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("name,age,id,gmail");
				Exception2 e1 = DataValidation.Checkvalidation( sc.next(), sc.nextInt(),sc.nextInt(), sc.next());
				//e.Checkvalidation();		
			}
			}