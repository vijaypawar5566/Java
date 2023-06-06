import java.lang.Exception;
import java.util.Scanner;


class myexception extends Exception{
	
	public myexception(String s)
	{
		super(s);
	}
}


 class ExceptionHand {

	private int age;
	private String name;
	private int empno;
	private String gmail;

	public ExceptionHand(int age, String name, int empno, String gmail) {

		this.age = age;
		this.name = name;
		this.empno = empno;
		this.gmail = gmail;

	}	

}

 class ExceptionhandTest{
	
	public static void Datavalidation(int age,String name,int empno,String gmail) throws myexception {

	if(age>40 || age<20)
		{
			throw new myexception("Invalid age");
		}else
		if(name.charAt(0)<65 || name.charAt(0)>90 )
			{
				throw new myexception("first letter should be Capital");
			}
		if(empno<1000 || empno>9999)
			{
			throw new myexception("Invalid Emp id");
			}
		if(gmail.contains(".gmail.com"))
		{
			System.out.println();
		}else
			System.out.println("invalid Output");
	}
	 
	 public static void main(String[] args)
	 {
		try{
		 Scanner sc=new Scanner(System.in);
		 int age=sc.nextInt();
		String name=sc.next();
		int empno=sc.nextInt();
		String gmail=sc.next();
		Datavalidation(age,name,empno,gmail);
		System.out.println("Enter age,name ,empno,gmail");
		ExceptionHand e= new ExceptionHand(age,name,empno,gmail);
		}
		catch(myexception e)
		{
			System.out.println(e.getMessage());
		}
		 
		 
	 }
	
}