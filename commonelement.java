 //Write a Java program to find the common elements between two arrays 	
       	

		class commonelement{
		public static void main(String[] args)
		{
			String str="vijay";
			String str1="jay";

		char []ch=	str.toCharArray();
		char[]ch1= 	str1.toCharArray();

		for(char ch2:ch)
			{	
				for(char i=0;i<ch1.length;i++)
				{
					if(ch2==ch1[i])
					System.out.println(ch2);
				}
			}
		}
	}