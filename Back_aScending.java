
public class Back_aScending {
	public static void main(String[] args)
	{
		int row=6;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=((2*row));j++)
			{
				if(j>=((2*row)-i) )
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
