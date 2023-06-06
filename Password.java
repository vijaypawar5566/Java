import java.util.Scanner;
public class Password {

		public static void main(String []args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name ");
			String name = sc.next();
			
			System.out.println("Enter EmpNo");
			String number = sc.next();
			char []num= number.toCharArray();
			char []ch=name.toCharArray();
			char []pass =new char[7];
			int a=0;
			
			
			for(char i=0;i<pass.length;i++)
			{
				if(ch.length<3 || num.length<3)
					{System.out.println(" invalid Input");
					break;
					}
				else {
				if(i<3 )  // vijay  vij
				{
					pass[i]=ch[i];
				}
					else
					{
					if(i>=3 && i<=5)
					{
						pass[i]=num[a];
						a++;
					}
					else {
					if(i==6)
					{
						pass[i]=ch[ch.length-1];
					}
					}
					}
				}
				}
			
			for(char c:pass)
			{
				System.out.print(c);
			}
				
			}
		}

