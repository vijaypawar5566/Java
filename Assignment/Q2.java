//Write a Java program that reads in two floating-point 
//numbers and tests whether they are the same up to three decimal
//places.
import java.util.Scanner;

public class Q2 {
	public static void main(String []args)
	{
		float num1;
		float num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two float values");
		num1=sc.nextFloat();
		num2=sc.nextFloat();
		
		num1*=1000;
		num2*=1000;
		
		if((int)num1==(int)num2)
		{
			System.out.println("Equal");
		}
		else
			System.out.println("Not Equal");
	}

}
