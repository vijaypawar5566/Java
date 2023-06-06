//public class Q11_final {
//	public static void main(String []args) 
//	{
//		int big=1115;
//		int small=25; //2
//		int asmall=small;
//		int scnt=0;
//		int limit=1; //100
//		int add=0;
//		while (asmall!=0)
//		{
//		 asmall/=10;
//			scnt=scnt+1;
//		}
//		
//		System.out.println(scnt);
//		for(int i=0;i<scnt;i++)
//		{
//			limit*=10;
//		}
//		
//		while(limit>=10)
//		{
//			int cloneN=big;
//			while(cloneN!=0)
//			{
//				int rem = cloneN%limit;
//				if(rem<small && rem>=limit/10)
//				{
//					add=add+rem;
//				}
//				cloneN/=10;
//				
//			}
//			limit/=10;
//			cloneN=big;
//		}
//		System.out.println(add);
//	}
//}