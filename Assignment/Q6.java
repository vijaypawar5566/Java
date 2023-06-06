 //Write a Java method to compute the sum of the digits
//in an integer.

import java.util.Scanner;
import java.util.ArrayList;
public class Q6 {

	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int count = 0;
		while(num!=0)
		{
			
			count=count+1;
			num/=10;
				
		}
			System.out.println(count);
	}
}

class timepass{
	char []ch = new char[9];
	char []ch1 = new char[9];
	
	String a="vijay";
	char []ch2=a.toCharArray();
	String s=ch2.toString();
	
	//ArrayList<String> str=new ArrayList<>();
	
	//str[0].add("hii");
	
	
}