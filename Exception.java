import java.util.*;
public class Exception {
public static void main(String[] args) 
{
	int a;
	int b;
	Scanner sc=new Scanner(System.in);
	//Random r=new Random();
	System.out.println("Enter two element");
	a=sc.nextInt();
	b=sc.nextInt();
	try {
		
		System.out.println(a/b);
	}catch(ArithmeticException e)
	{
		System.out.println(e.toString());
	}
	sc.close();
	}

	public String toString(Exception e)
	{
		return "Invalid Input"; 
	}
	
}
