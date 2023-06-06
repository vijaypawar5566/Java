
import java.util.Scanner;

//Write a Java method to count all vowels in a string.

public class Q5 {
	
	public static void main(String[] args)
	{
		int cnt = 0;
		String str2="aeiou";
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string");
		str=sc.next().toLowerCase();
		
		char[] ch = str.toCharArray();
	    char[] st =str2.toCharArray();
	
		
		for(int i=0;i<str.length();i++)
		{
		
		if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
		{
			cnt=cnt+1;
		}
		
		}
		System.out.println(cnt);
		
		
	
		
	}
	
}
