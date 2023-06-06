import java.util.Scanner;
import java.util.ArrayList;
	class Substring1{
	public static void main(String []args)
		{
		Scanner sc = new Scanner(System.in);
		String s = "IACSD";
		int a = 2;
		
		char []ch=s.toCharArray();
		//ArrayList<Character> ac= new ArrayList<>();
		
		for(int i=0;i<=ch.length;i++) // iacsd
		{
			for(int j=i;j<a;j++)
			{
				System.out.print(ch[j]);
			}
			System.out.println();
			a++
			
		}	
	
		}
		}