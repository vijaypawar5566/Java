import java.util.Scanner;

//WAP to generate first ‘n’ elements of fibonacci series
public class Q8 {
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int n=sc.nextInt();
		int f1=0;
		int f2=1;
		int LastTerm;
				for(int i=0;i<n;i++)
		{
			
			LastTerm=f1+f2;
			System.out.print(" "+LastTerm);
			f1=f2;
			f2=LastTerm;
			
			
		}
	}
}
