import java.util.Scanner;
import java.util.HashSet;
	class count{
		public static void main(String []args)

		{
			Scanner sc = new Scanner(System.in);
			String name=sc.next();
			int cnt=0;

			char []ch=name.toCharArray();
			HashSet<Character> str=new HashSet<>();
			for(int i=0;i<ch.length;i++)
			{
				str.add(ch[i]);
				
			}
			
			for(Character c:str){
	                 cnt=0;
	                  for(int i=0;i<ch.length;i++){
		          if(c==ch[i])
			    cnt++;
		     }
		System.out.println(c+" repeted  :"+cnt+" times.");
			
	     }
       
}
}