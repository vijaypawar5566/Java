import java.util.Scanner;
class diamond{

	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Value");
			int n = sc.nextInt();
			int a = (n)/2;
			int bef=a;
			int aft=a;
			for(int i=0;i<n;i++)
			{
			 for (int j=0;j<n;j++)
				{
					

					if(j==a || i==a || (j>=bef && j<=aft ))
					System.out.print("*");	   
				
				else
				System.out.print(" ");
				}
			System.out.println();
			if(i>=a)
			{ bef++;
			aft--;
			}else
			{ bef--;
			aft++;
			}
			}
		}

	}