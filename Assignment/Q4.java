//import java.util.Iterator;
import java.util.Scanner;

//Write a Java program to find the common elements
//between two arrays (string values).

import java.util.HashSet;
public class Q4 {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str1;
		String str2;
		
		System.out.println("Enter two String");
		str1=sc.next();
		str2=sc.next();
		
		char []ch1=str1.toCharArray();
		HashSet<Character> hs=new HashSet<>();
		
		for(int i=0;i<str1.length();i++)
		{
			char c=ch1[i];
			if(str2.contains(str1.valueOf(c)))
					{
						hs.add(c);
					}
		}
		
		for(char a:hs)
		{
			System.out.println(a);
		}
		
		
	}
}
