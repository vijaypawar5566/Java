import java.util.Scanner;
class Swastik {
    public static void main(String args[] ) throws Exception {
 
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=(a+1)/2;

        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
            {
                if(j==b || (i==1 && j>=b) || (i==a && j<=b) || (i<=b && j==1) || i==b || (i>=b && j==a))
                {
                    System.out.print("* ");
                }
		else
		System.out.print("  ");
            }
            System.out.println();
        }
      

    }
}
