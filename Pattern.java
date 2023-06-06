
		//import java.util.Scanner;
		public class Pattern {

		public static void main(String[] args)
		{
			int a=0;
			int b=10;

			for(int i=0;i<=10;i++)
				{
				for(int j=0;j<=10;j++)
					{
						if((j==a) || (j==b))
						System.out.print("*");
						else
						System.out.print(" ");
					}
					System.out.println();
					a++;
					b--;
				}
		       }
		}