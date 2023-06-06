
//WAP to find all prime numbers between 100 to 1000
import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
	
		
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int count=0;
		num1=sc.nextInt();
		
		for(int i=1;i<num1;i++)
		{
			if(num1%i==0) //7%1
			{
				count=count+1;
			}
		}
		//System.out.println(count);
		if(count==1)
		{
			System.out.println("Prime");
		}
		else
			System.out.println("Not a Prime");
	}
	}