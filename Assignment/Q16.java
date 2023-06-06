//WAP where one array is given. Write a function such that it right rotates
//array by given number of positions
//Ex. array [2,5,34,56] → right rotate by 2 position → o/p [34,56,2,5]   
//so all elements shift right and last two elements comes in beginning
//import java.util.*;
public class Q16 {
	public static void main(String[] args)
	{
		int []a= {34,56,2,5,15,9}; // 5 7 34 56 2 5
		int cnt=0;
		int b=2;
//		
//		for(int i=0;i<2;)
//		{
//			
//			int temp;
//			temp=a[i]; // 1 //  4215 // 
//			a[i]=a[b]; // 4
//			a[b]=temp; //1
//			i++; // 1
//			b++; //1

	
				for(int j=0;j<2;j++)
				{
					int t=a[j]; //56
					a[j]=a[j+b]; // 5
					a[j+b]=t;
					
					
					if(j==1 && cnt==0)
					{
						j=-1;
						cnt++;

						b+=2;
					}
					
				}
				

		for(int c : a)
		{
			System.out.print(c+" ");
		}
			
	}
}
	