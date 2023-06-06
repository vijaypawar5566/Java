
public class Q9Prime {
	public static void main(String[] args) {

		
		int num;
		int cnt=0;
		
		for (num=100;num<=1000;num++)
		{
			for(int i=1;i<=num/2;i++)
			{
				if(num%i==0)
				{
					cnt=cnt+1;
				}
				
			}
			if(cnt<2)
				System.out.println("Prime : "+num);
			cnt=0;
		}
	}
}
